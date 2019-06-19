DESCRIPTION = "AWS based cloud logger sample application"
DEPENDS = "awsiotsdk-c sqlite3"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

SRC_URI = "git://source.codeaurora.org/external/qoriq/qoriq-yocto-sdk/cloud-datalogger;nobranch=1"
SRCREV = "5875710570e191430b549b3f090c41333d86a107"

S = "${WORKDIR}/git"

DEPENDS += "awsiotsdk-c sqlite3"

CFLAGS += "-O0 -Wall -g -DAWS_CLOUD"
CFLAGS += " -I${TMPDIR}/sysroots-components/aarch64/awsiotsdk-c/usr/include/awsiotsdk"
CFLAGS += " -I${TMPDIR}/sysroots-components/aarch64/mbedtls/usr/include"
CFLAGS += " -I${TMPDIR}/sysroots-components/aarch64/sqlite3/usr/include"

LDFLAGS += "${TMPDIR}/sysroots-components/aarch64/awsiotsdk-c/usr/lib/libawsiotsdk.a"
LDFLAGS += "${TMPDIR}/sysroots-components/aarch64/mbedtls/usr/lib/libmbedtls.a"
LDFLAGS += "${TMPDIR}/sysroots-components/aarch64/mbedtls/usr/lib/libmbedcrypto.a"
LDFLAGS += "${TMPDIR}/sysroots-components/aarch64/mbedtls/usr/lib/libmbedx509.a"
LDFLAGS += "-L${TMPDIR}/sysroots-components/aarch64/sqlite3/usr/lib"
LDFLAGS += "-lpthread -lsqlite3"

EXTRA_OEMAKE = "CC='${CC}' LD='${CCLD}' V=1 ARCH=${TARGET_ARCH} CROSS_COMPILE=${TARGET_PREFIX} CFLAGS='${CFLAGS} ${LDFLAGS}'"

FILES_${PN} = "/home/root/*"

do_compile(){
    cp ${S}/makefile-aws ${S}/makefile
    oe_runmake 
}

do_install(){
    install -d ${D}/home/root
    install -d ${D}/home/root/aws_iot-c-sdk
    install -d ${D}/home/root/aws_iot-c-sdk/certs
    cp ${S}/datalogger_can_data.csv ${D}/home/root/
    cp ${S}/aws_config.txt ${D}/home/root/
    cp ${S}/aws-cloudlogger ${D}/home/root/
    cp ${S}/aws_certs/* ${D}/home/root/aws_iot-c-sdk/certs/
}

ALLOW_EMPTY_${PN} = "1"

PACKAGE_ARCH = "${MACHINE_ARCH}"

