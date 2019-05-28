FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_ls1043avnpevb += " file://0001-ls1043a-dcm-add-support-of-qspi-boot.patch"

do_install_prepend_ls1043avnpevb () {
        cp -rf ${S}/ls1043ardb ${S}/${M}
}


