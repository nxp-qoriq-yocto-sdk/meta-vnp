FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_ls1043avnpevb = "git://git.netfilter.org/libnetfilter_conntrack;protocol=git"
SRCREV = "e870432649955d377a73ee5a72cb23f0f6b5e4c5"
SRC_URI[md5sum] = "c59840184207e08b2c64705aa575b9cd"
SRC_URI[sha256sum] = "09545c9abb30847a1a277ee9569b6b44ef1ad0f5ddd0a15fde410b0e5b0b05da"

S_ls1043avnpevb = "${WORKDIR}/git"

SRC_URI_append_ls1043avnpevb += " \
                      file://01-LAYERSCAPE-ips_status_definitions.patch \
                      file://02-LAYERSCAPE-socket_buffer_size.patch \
                      file://04-LAYERSCAPE-comcerto_fp_info.patch \
                      file://05-LAYERSCAPE-build-id.patch \
                      file://06-LAYERSCAPE-underlying_iif.patch \
"



