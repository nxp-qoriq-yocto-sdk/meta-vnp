FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_ls1043avnpevb += " file://73-fsl-dpaa-persistent-networking.rules"
SRC_URI_append_ls1043avnprdb += " file://74-fsl-dpaa-persistent-networking.rules"

RULE_ls1043a_ls1043avnprdb = "74-fsl-dpaa-persistent-networking.rules"
