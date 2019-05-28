DESCRIPTION = "ASK Kernel module for Auto bridge"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

SRC_URI = "git://git@bitbucket.sw.nxp.com/dnagw/auto-bridge.git;nobranch=1;protocol=ssh"
SRCREV = "9f012c9fafccdbc4d9ea6531f4ebbc65525aa969"

inherit module

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "(ls1043avnpevb)"
PACKAGE_ARCH = "${MACHINE_ARCH}"
