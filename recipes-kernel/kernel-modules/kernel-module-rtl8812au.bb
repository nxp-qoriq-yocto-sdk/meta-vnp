DESCRIPTION = "rtl8812au linux kernel driver for Wireless Dual-Band USB Adapter"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1b3e79661a0d2a7f0ad9ccc86c20854e"

SRC_URI = "git://source.codeaurora.org/external/qoriq/qoriq-yocto-sdk/rtl8812au;nobranch=1 \
           file://001_ARM_compilation.patch \
"
SRCREV = "bd71ad1cb26fd16f53eb0da932cb50e4f5f69e0f"

S = "${WORKDIR}/git"
EXTRA_OEMAKE ="CROSS_COMPILE=${TARGET_PREFIX} KSRC=${TMPDIR}/work/${MACHINE}-fsl-linux/linux-qoriq/4.14-r0/build ARCH=arm64"

inherit module

do_install(){
    install -d ${D}/lib/modules/${KERNEL_VERSION}/extra
    cp ${S}/rtl8812au.ko ${D}/lib/modules/${KERNEL_VERSION}/extra/
}

COMPATIBLE_MACHINE = "(ls1043avnpevb)"
PACKAGE_ARCH = "${MACHINE_ARCH}"
