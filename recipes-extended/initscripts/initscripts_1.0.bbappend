
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_ls1043avnpevb += " file://ask-load.sh"

do_install_append_ls1043avnpevb () {
	install -m 0755    ${WORKDIR}/ask-load.sh       ${D}${sysconfdir}/init.d
	update-rc.d -r ${D} ask-load.sh start 99 S .
}


