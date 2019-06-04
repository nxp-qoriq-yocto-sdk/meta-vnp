DESCRIPTION = "Cisco like CLI library"
DEPENDS = ""
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=fad9b3332be894bab9bc501572864b29"

SRC_URI = "git://source.codeaurora.org/external/qoriq/qoriq-yocto-sdk/libcli;nobranch=1 "
SRCREV = "68ff8c0721e489dd1a49578079ffb4c68b296871"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "CC='${CC}' LD='${CCLD}' V=1 ARCH=${TARGET_ARCH} CROSS_COMPILE=${TARGET_PREFIX}"

do_compile(){
    oe_runmake 
}

do_install(){
    install -d ${D}${includedir} ${D}${libdir}
    cp ${S}/libcli.h ${D}${includedir}/
    cp ${S}/libcli.so.1.9.3 ${D}${libdir}/
    ln -sf libcli.so.1.9.3 ${D}${libdir}/libcli.so
}

ALLOW_EMPTY_${PN} = "1"

PACKAGE_ARCH = "${MACHINE_ARCH}"
