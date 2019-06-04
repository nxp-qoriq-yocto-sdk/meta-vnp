DESCRIPTION = "ASK Kernel module for CDX"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

SRC_URI = "git://source.codeaurora.org/external/qoriq/qoriq-yocto-sdk/cdx;nobranch=1 \
           file://cdx-qos-queue-check.patch \
           file://001_dcm_cdx.patch \
" 
SRCREV = "4f0e3a7b6247702ddd974de36c0c576cda7f9a83"

inherit module

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "(ls1043avnpevb)"
PACKAGE_ARCH = "${MACHINE_ARCH}"
