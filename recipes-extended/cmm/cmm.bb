DESCRIPTION = "Conntrack Monitor Module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"
DEPENDS = "libnetfilter-conntrack libcli libpcap fci"

SRC_URI = "git://source.codeaurora.org/external/qoriq/qoriq-yocto-sdk/cmm;nobranch=1 \
           file://001_disable_libcmm_sample.patch \
           file://cmm \
           file://fastforward \
"
SRCREV = "d8eb8cca262ee3a3080a02782aa54062691bd1be"

S = "${WORKDIR}/git"

CFLAGS += "-Wno-error -DLS1043 -DFLOW_STATS -DWIFI_ENABLE -DAUTO_BRIDGE -DIPSEC_SUPPORT_DISABLED"
CFLAGS += "-I${TMPDIR}/sysroots-components/${MACHINE}/libcli/usr/include"
CFLAGS += "-I${TMPDIR}/work/${MACHINE}-fsl-linux/fci/1.0-r0/git/lib/include"
CFLAGS += "-I${TMPDIR}/sysroots-components/aarch64/libpcap/usr/include"
CFLAGS += "-I${TMPDIR}/work-shared/${MACHINE}/kernel-source/include/uapi/linux/netfilter"
CFLAGS += "-I${TMPDIR}/work/${MACHINE}-fsl-linux/kernel-module-ask-auto-bridge/1.0-r0/git/include"

LDFLAGS += "-L${TMPDIR}/work/${MACHINE}-fsl-linux/cmm/1.0-r0/build/src/.libs"

EXTRA_OEMAKE = "CC='${CC}' LD='${CCLD}' V=1 ARCH=${TARGET_ARCH} CROSS_COMPILE=${TARGET_PREFIX} CFLAGS='${CFLAGS} ${LDFLAGS}'"

inherit update-rc.d autotools pkgconfig

INITSCRIPT_NAME = "cmm"
INITSCRIPT_PARAMS = "start 99 2 3 4 5 . stop 22 0 1 6 ."  
FILES_${PN} = "${sysconfdir}/* ${bindir}/* ${libdir}/*"

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${libdir}
    install -d ${D}${sysconfdir}
    install -d ${D}${sysconfdir}/init.d/
    install -d ${D}${sysconfdir}/config/
    install -m 755 ${WORKDIR}/build/src/.libs/cmm ${D}${bindir}/ 
    install -m 755 ${WORKDIR}/build/src/.libs/libcmm.so.0 ${D}${libdir}/ 
    install -m 755 ${WORKDIR}/fastforward ${D}${sysconfdir}/config/fastforward
    install -m 755 ${WORKDIR}/cmm ${D}${sysconfdir}/init.d/cmm
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
