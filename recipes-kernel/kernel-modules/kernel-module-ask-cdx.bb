DESCRIPTION = "ASK Kernel module for CDX"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

SRC_URI = "git://source.codeaurora.org/external/qoriq/qoriq-yocto-sdk/cdx;nobranch=1 \
           file://cdx-qos-queue-check.patch \
           file://001_dcm_cdx.patch \
           file://0001-adding-devman.h-file.patch \
           file://0002-DNCPE-1581-Passing-iface-id-instead-of-iface.patch \
           file://0003-DNCPE-1581-Debug-print-flag-correction.patch \
           file://0004-DNCPE-1581-Missing-initialization.patch\
           file://0005-DNCPE-1581-Incorrect-function-calls.patch \
           file://0006-DNCPE-1564-vlan-support-in-bridge.patch \
" 
SRCREV = "4f0e3a7b6247702ddd974de36c0c576cda7f9a83"

inherit module

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "(ls1043avnpevb)"
PACKAGE_ARCH = "${MACHINE_ARCH}"
