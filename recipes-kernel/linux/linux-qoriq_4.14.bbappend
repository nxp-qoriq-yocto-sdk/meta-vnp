FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_ls1043avnpevb += " \
                      file://vnp-kernel.config \
                      file://0001-ask-kernel-patch-for-414.patch \
                      file://0002-armv8-fsl-layerscape-Add-support-of-LS1043A-DCM-boar.patch \
                      file://0003-mtd-spi-add-support-for-mt25tl01g-SPI-flash.patch \
                      file://0004-ls1043adcm-disable-autoneg-of-FMAN-IM.patch \
                      file://0005-fman_memac_adjust_link-if-RGMII-ensure-RG-and-IFMODE.patch \
                      file://0006-memac_init_phy-set-adjust_link-callback-even-for-fix.patch \
"

DELTA_KERNEL_DEFCONFIG_append_ls1043avnpevb = "vnp-kernel.config "
