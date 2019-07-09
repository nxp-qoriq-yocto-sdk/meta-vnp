DESCRIPTION = "ASK Kernel module for Auto bridge"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

SRC_URI = "git://source.codeaurora.org/external/qoriq/qoriq-yocto-sdk/auto-bridge;nobranch=1 \
           file://0001-DNCPE-1317-fix-for-crash-after-running-cat-proc-net-.patch \
"
SRCREV = "9f012c9fafccdbc4d9ea6531f4ebbc65525aa969"

inherit module

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "(ls1043avnpevb)"
PACKAGE_ARCH = "${MACHINE_ARCH}"
