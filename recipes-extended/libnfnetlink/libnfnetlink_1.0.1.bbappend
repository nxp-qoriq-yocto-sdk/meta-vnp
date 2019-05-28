FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_ls1043avnpevb = "http://www.netfilter.org/projects/libnfnetlink/files/libnfnetlink-1.0.1.tar.bz2;name=tar \
"

SRC_URI_append_ls1043avnpevb += " \
                       file://100-missing_include.patch \
                       file://900-LAYERSCAPE-non_blockingmode.patch \
"

