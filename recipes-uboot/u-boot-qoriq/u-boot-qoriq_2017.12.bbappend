FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_ls1043avnpevb += " \
	file://0001-board-ls1043adcm-Enable-IIC2-controller-during-SD-bo.patch \
	file://0002-mtd-spi-add-support-for-mt25tl01g-SPI-flash.patch \
	file://0003-board-ls1043a-LS1043A-DCM-board-support.patch \
	file://0004-ls1043a-dcm-Change-serdes-for-supporting-SGMII.patch \
        file://0005-ls1043a-dcm-fixed-link-PHY-support.patch \
	file://0006-ls1043a-dcm-Change-serdes-for-supporting-SGMII-and-P.patch \
	file://0007-board-ls1043adcm-disable-autoneg-of-FMAN-IM.patch \
	file://0008-net-fm-enable-SGMII-1G-in-auto-neg-disable.patch \
	file://0009-board-ls1043adcm-add-autoboot-commands-for-NAND-SD-b.patch \
	file://0010-board-ls1043adcm-Move-CONFIG_ENV_IS_IN_SPI_FLASH-for.patch \
	file://0011-board-freescale-ls1043adcm-Move-CONFIG_ENV_IS_IN-fro.patch \
	file://0012-arch-arm-dts-ls1043adcm-Change-QSPI-flash-size-to-12.patch \
	file://0013-armv8-ls1043adcm-disable-PPA-loading-during-SPL-stag.patch \
	file://0014-Enable-RGMII.patch \
	file://0015-armv8-ls1043adcm-Enable-USB-support.patch \
	file://0016-ls1043adcm-Enable-saveenv.patch \
"



