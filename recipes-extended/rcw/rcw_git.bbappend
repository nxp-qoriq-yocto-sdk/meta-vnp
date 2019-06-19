FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_ls1043avnpevb += " file://0001-ls1043a-dcm-add-support-of-qspi-boot.patch"

SRC_URI_append_ls1043avnprdb += " \
  	file://0002-ls1043a-vnp-add-support-of-serdes-protocol-0x1355.patch \
        file://0003-ls1043a-vnp-add-support-of-serdes-protocol-0x2355-0x.patch \
        file://0004-ls1043a-vnp-edit-serdes-protocol-description-for-0x2.patch \
        file://0005-adaptation-of-rcw-serdes-0x1355-for-vnp-platform.patch \
        file://0006-Update-SRDS_PLL_REF_CLK_SEL_S1-2-RCW-160-161.patch \
        file://0007-ls1043a-vnprdb-reduce-core-clock-to-1400-MHz-by-CGA_.patch \
"


do_install_prepend_ls1043avnpevb () {
        cp -rf ${S}/ls1043ardb ${S}/${MACHINE}
}



