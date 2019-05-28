DESCRIPTION = "ASK user space module for FCI(fast control interface)"
#DEPENDS = "libxml2 libstdcpp fmc libcli libpthread"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

SRC_URI = "git://git@bitbucket.sw.nxp.com/dnagw/fci.git;nobranch=1;protocol=ssh"
SRCREV = "d38ebd017fddd33897019bd6efeed482371761f5" 

S = "${WORKDIR}/git/lib"

EXTRA_OEMAKE = "CC='${CC}' LD='${CCLD}' V=1 ARCH=${TARGET_ARCH} BOARD_ARCH=arm64 CROSS_COMPILE=${TARGET_PREFIX}"

inherit autotools pkgconfig

PACKAGE_ARCH = "${MACHINE_ARCH}"

