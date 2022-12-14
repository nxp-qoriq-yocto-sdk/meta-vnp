# Copyright (C) 2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Freescale Package group for core networking tools"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

PACKAGES = "${PN} ${PN}-server"

RDEPENDS_${PN} = " \
    optee-os-qoriq \
    bridge-utils \
    ethtool \
    iproute2 \
    iproute2-tc \
    iptables \
    iputils \
    inetutils \
    inetutils-hostname \
    inetutils-ifconfig \
    inetutils-logger \
    inetutils-ping \
    inetutils-ping6 \
    inetutils-rsh \
    inetutils-telnet \
    inetutils-traceroute \
    ipsec-tools \
    ipsec-demo \
    net-tools \
    tcpdump \
    watchdog \
    vlan \
    libcli \
    dpa-app \
    fci \
    cmm \
    usb-modeswitch \
    usb-modeswitch-data \
    wpa-supplicant \
    curl \
    awsiotsdk-c \
    azure-iot-sdk-c \
    aws-cloudlogger \
    azure-cloudlogger \
    sqlite3 \
"

RDEPENDS_${PN}-server = " \
    inetutils-inetd \
    inetutils-rshd \
    inetutils-telnetd \
"

RDEPENDS_${PN}_append_qoriq = "\
    packagegroup-fsl-networking-core-server \
"

