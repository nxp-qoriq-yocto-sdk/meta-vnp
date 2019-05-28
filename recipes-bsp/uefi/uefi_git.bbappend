FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"


do_install_prepend_ls1043avnpevb () {
        cp -rf ${S}/ls1043ardb ${S}/ls1043avnpevb
}


