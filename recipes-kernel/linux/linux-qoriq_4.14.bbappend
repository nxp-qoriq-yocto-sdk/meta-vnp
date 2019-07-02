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
SRC_URI_append_ls1043avnprdb += " \
	file://0007-net-phy-aquantia-Added-multigig-speeds.patch \
	file://0008-net-phy-aquantia-add-support-for-autoneg.patch \
	file://0009-net-phy-aquantia-Fix-unknown-speed-reported-by-phy.patch \
	file://0010-net-phy-aquantia-Read-configured-advertisements-from.patch \
	file://0011-net-phy-aquantia-read-link-partner-advertise-from-ph.patch \
	file://0012-net-phy-aquantia-Access-register-with-clause-45.patch \
	file://0013-net-phy-aquantia-Read-link-status-twice.patch \
	file://0014-sdk_dpaa-advertise-2.5G-speeds-for-xgmii-interfaces.patch \
	file://0015-arm64-dts-ls1043a-support-vnp-rdb-platform.patch \
	file://0016-dts-vnprdb-Support-network-interfaces-on-ls1043avnpr.patch \
	file://0017-updating-the-condition-for-buffer-recycle.patch \
"
DELTA_KERNEL_DEFCONFIG_append_ls1043avnpevb = "vnp-kernel.config "
DELTA_KERNEL_DEFCONFIG_append_ls1043avnprdb = "vnp-kernel.config "
