DESCRIPTION = "Azure based cloud logger sample application"
DEPENDS = "azure-iot-sdk-c sqlite3"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

SRC_URI = "git://source.codeaurora.org/external/qoriq/qoriq-yocto-sdk/cloud-datalogger;nobranch=1"
SRCREV = "5875710570e191430b549b3f090c41333d86a107"

S = "${WORKDIR}/git"

DEPENDS += "azure-iot-sdk-c sqlite3"

CFLAGS += "-O0 -Wall -g -DAZURE_CLOUD -DSAMPLE_MQTT"
CFLAGS += " -I${TMPDIR}/sysroots-components/aarch64/azure-iot-sdk-c/usr/include/azureiot"
CFLAGS += " -I${TMPDIR}/work/aarch64-fsl-linux/azure-c-shared-utility/1.1.10-r0/git/inc"
CFLAGS += " -I${TMPDIR}/sysroots-components/aarch64/sqlite3/usr/include"

LDFLAGS += "${TMPDIR}/work/aarch64-fsl-linux/azure-c-shared-utility/1.1.10-r0/build/libaziotsharedutil.a"
LDFLAGS += "${TMPDIR}/work/aarch64-fsl-linux/azure-iot-sdk-c/1.2.10-r0/build/iothub_client/libiothub_client.a"
LDFLAGS += "${TMPDIR}/work/aarch64-fsl-linux/azure-iot-sdk-c/1.2.10-r0/build/iothub_client/libiothub_client_mqtt_transport.a"
LDFLAGS += "${TMPDIR}/work/aarch64-fsl-linux/azure-c-shared-utility/1.1.10-r0/build/libaziotsharedutil.a"

LDFLAGS += "-L${TMPDIR}/sysroots-components/aarch64/sqlite3/usr/lib"
LDFLAGS += "-L${TMPDIR}/work/aarch64-fsl-linux/curl/7.58.0-r0/build/lib/.libs"
LDFLAGS += "-L${TMPDIR}/work/aarch64-qoriq-fsl-linux/openssl-qoriq/1.0.2l-r0/git"
LDFLAGS += "-L${TMPDIR}/sysroots-components/aarch64/gnutls/usr/lib"
LDFLAGS += "-L${TMPDIR}/work/aarch64-fsl-linux/nettle/3.4-r0/image/usr/lib"
LDFLAGS += "-L${TMPDIR}/work/aarch64-fsl-linux/zlib/1.2.11-r0/image/lib"
LDFLAGS += "-L${TMPDIR}/work/aarch64-fsl-linux/libunistring/0.9.9-r0/image/usr/lib"
LDFLAGS += "-L${TMPDIR}/work/aarch64-fsl-linux/gmp/6.1.2-r0/image/usr/lib"
LDFLAGS += "-L${TMPDIR}/work/aarch64-fsl-linux/azure-umqtt-c/1.1.10-r0/build"

LDFLAGS += " -lumqtt -lm -lpthread -lsqlite3 -lcurl -lssl -lcrypto -lgnutls -lnettle -lhogweed -lz -lunistring -lgmp"

EXTRA_OEMAKE = "CC='${CC}' LD='${CCLD}' V=1 ARCH=${TARGET_ARCH} CROSS_COMPILE=${TARGET_PREFIX} CFLAGS='${CFLAGS} ${LDFLAGS}'"

FILES_${PN} = "/home/root/*"

do_compile(){
    cp ${S}/makefile-azure ${S}/makefile
    oe_runmake 
}

do_install(){
    install -d ${D}/home/root
    cp ${S}/datalogger_can_data.csv ${D}/home/root/
    cp ${S}/azure_config.txt ${D}/home/root/
    cp ${S}/azure-cloudlogger ${D}/home/root/
}

ALLOW_EMPTY_${PN} = "1"

PACKAGE_ARCH = "${MACHINE_ARCH}"

