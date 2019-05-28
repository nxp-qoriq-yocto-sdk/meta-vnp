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
insmod /lib/modules/4.14.16+gdfe1b1320d85/extra/auto_bridge.ko
insmod /lib/modules/4.14.16+gdfe1b1320d85/extra/cdx.ko
insmod /lib/modules/4.14.16+gdfe1b1320d85/extra/fci.ko
insmod /lib/modules/4.14.16+gdfe1b1320d85/kernel/net/rfkill/rfkill.ko
insmod /lib/modules/4.14.16+gdfe1b1320d85/kernel/net/wireless/cfg80211.ko
insmod /lib/modules/4.14.16+gdfe1b1320d85/extra/rtl8812au.ko

echo "Enabling ipv4 forwarding... "
echo 1 > /proc/sys/net/ipv4/ip_forward
iptables -t filter -A FORWARD -m conntrack --ctstate RELATED,ESTABLISHED -j ACCEPT

: exit 0
