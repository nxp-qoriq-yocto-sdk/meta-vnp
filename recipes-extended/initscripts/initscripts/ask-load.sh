#!/bin/sh
### BEGIN INIT INFO
# Provides:          hostname
# Required-Start:
# Required-Stop:
# Default-Start:     S
# Default-Stop:
# Short-Description: Set hostname based on /etc/hostname
### END INIT INFO

PATH="/sbin:/bin:/usr/sbin:/usr/bin"

echo "Loading ASK specific kernel modules... "
insmod /lib/modules/$(uname -r)/extra/auto_bridge.ko
insmod /lib/modules/$(uname -r)/extra/cdx.ko
insmod /lib/modules/$(uname -r)/extra/fci.ko
insmod /lib/modules/$(uname -r)/kernel/net/rfkill/rfkill.ko
insmod /lib/modules/$(uname -r)/kernel/net/wireless/cfg80211.ko
insmod /lib/modules/$(uname -r)/extra/rtl8812au.ko

echo "Enabling ipv4 forwarding... "
echo 1 > /proc/sys/net/ipv4/ip_forward
iptables -t filter -A FORWARD -m conntrack --ctstate RELATED,ESTABLISHED -j ACCEPT

echo "Enabling ipv6 forwarding... "
echo 1 > /proc/sys/net/ipv6/conf/all/forwarding
ip6tables -t filter -A FORWARD -m conntrack --ctstate RELATED,ESTABLISHED -j ACCEPT

mkdir -p /sqlite3-db

echo -e "ctrl_interface=DIR=/run/wpa_supplicant \nupdate_config=1" > /etc/wpa_supplicant-evb.conf
echo -e "ctrl_interface=DIR=/var/run/wpa_supplicant \nupdate_config=1" > /etc/wpa_supplicant-rdb.conf

#echo "Mounting NAND partition and starting a script"
#cd /home/root
#mkdir saved_files
#mount /dev/mtdblock1 saved_files/
#/home/root/saved_files/startup.sh &

: exit 0
