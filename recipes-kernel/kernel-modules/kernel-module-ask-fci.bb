DESCRIPTION = "ASK Kernel space module for FCI(fast control interface)"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

SRC_URI = "git://source.codeaurora.org/external/qoriq/qoriq-yocto-sdk/fci;nobranch=1"
SRCREV = "d38ebd017fddd33897019bd6efeed482371761f5"


inherit module

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "(ls1043avnpevb)"
PACKAGE_ARCH = "${MACHINE_ARCH}"
