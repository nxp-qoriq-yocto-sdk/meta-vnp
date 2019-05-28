DESCRIPTION = "Datapath acceleration application"
#DEPENDS = "libxml2 libstdcpp fmc libcli libpthread"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

SRC_URI = "git://git@bitbucket.sw.nxp.com/dnagw/dpa-app.git;nobranch=1;protocol=ssh \
           file://001_dcm_dpa-app.patch \
"
SRCREV = "c7d39171d27324d90138e1093fc8a17cdb85795a"

S = "${WORKDIR}/git"


DEPENDS += "libxml2 fmlib fmc libcli libpthread-stubs"
RDEPENDS_libasan += "libstdc++"

CFLAGS += " -I${TMPDIR}/sysroots-components/ls1043avnpevb/fmlib/usr/include/fmd"
CFLAGS += " -I${TMPDIR}/sysroots-components/aarch64-qoriq/fmc/usr/include/fmc"
CFLAGS += " -I${TMPDIR}/work/ls1043avnpevb-fsl-linux/fmlib/git-r1/git/include/fmd"
CFLAGS += " -I${TMPDIR}/work/aarch64-qoriq-fsl-linux/fmc/git-r2/git/source"
CFLAGS += " -I${TMPDIR}/work/ls1043avnpevb-fsl-linux/fmlib/git-r1/package/usr/include/fmd"
CFLAGS += " -I${TMPDIR}/work/ls1043avnpevb-fsl-linux/fmlib/git-r1/package/usr/include/fmd/integrations"
CFLAGS += " -I${TMPDIR}/work/ls1043avnpevb-fsl-linux/fmlib/git-r1/package/usr/include/fmd/Peripherals"
CFLAGS += " -I${TMPDIR}/work/ls1043avnpevb-fsl-linux/fmlib/git-r1/package/usr/include/fmd/integrations"
CFLAGS += " -I${TMPDIR}/work/ls1043avnpevb-fsl-linux/fmlib/git-r1/package/usr/include/fmd/Peripherals"
CFLAGS += " -I${TMPDIR}/work/ls1043avnpevb-fsl-linux/kernel-module-ask-cdx/1.0-r0/git"

CFLAGS += "-DDPAA_DEBUG_ENABLE"
CFLAGS += "-DLS1043_RDB"
CFLAGS += "-DNCSW_LINUX"
CFLAGS += "-DLS1043"
CFLAGS += "-DENDIAN_LITTLE"
CFLAGS += "-Os -Wall -Werror"
CFLAGS += "-fexceptions"

LDFLAGS += "-znow -zrelro -lz -lfm-arm -lfmc -lpthread -lcli -lstdc++ -lxml2"

export etcdir = "${sysconfdir}"

EXTRA_OEMAKE = "CC='${CC}' LD='${CCLD}' V=1 ARCH=${TARGET_ARCH} CROSS_COMPILE=${TARGET_PREFIX} CFLAGS='${CFLAGS} ${LDFLAGS}'"


do_compile(){
    oe_runmake 
}

do_install(){
    install -d ${D}${bindir}
    install -d ${D}${etcdir}
    cp ${S}/dpa_app ${D}${bindir}/
    cp ${S}/files/etc/cdx_* ${D}${etcdir}/
}

ALLOW_EMPTY_${PN} = "1"

PACKAGE_ARCH = "${MACHINE_ARCH}"

