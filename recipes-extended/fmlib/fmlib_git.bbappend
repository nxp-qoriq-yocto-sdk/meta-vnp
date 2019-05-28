FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_ls1043avnpevb += " \
                     file://01-LAYERSCAPE-external-hash-fmlib-additions.patch \
                     file://02-LAYERSCAPE-external-hash-fmlib-additions.patch \
"
