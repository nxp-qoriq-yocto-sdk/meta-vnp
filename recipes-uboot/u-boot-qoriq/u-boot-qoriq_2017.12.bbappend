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

SRC_URI_append_ls1043avnprdb += " \
        file://0017-board-ls1043a-Add-LS1043AVNPRDB-board-support.patch \
        file://0018-configure-extended-rcw-config-register-and-gpio-duri.patch \
        file://0019-ls1043avnprdb-Add-ddr-raw-timings-support.patch \
        file://0020-Add-EMMC-Boot-support-for-VNP-board.patch \
        file://0021-board-ls1043ardb-add-the-0x1355-SerDes-protocol.patch \
        file://0022-ls1043avnprdb-enable-the-MICREL-KSZ9031RNX-PHY-drive.patch \
        file://0023-ls1043avnprdb-remove-the-QSGMII-PHY-addresses.patch \
        file://0024-ls1043avnprdb-remove-fixed-PHY-config.patch \
        file://0025-ls1043a-common.h-required-for-usb-boot.patch \
        file://0026-net-fm-extend-SGMII-configs-of-DCM-to-VNPRDB.patch \
        file://0027-drivers-spi-backport-spi-driver-changes-for-s25fs512.patch \
        file://0028-configs-rename-ls1043avnp_rdb_defconfig-to-ls1043avn.patch \
        file://0029-configs-enable-proper-qspi-in-dts-and-config-file.patch \
        file://0030-configs-update-ls1043avnprdb.h-for-available-PHYs.patch \
        file://0031-Modify-model-in-dts-file-from-DCM-to-VNPRDB.patch \
        file://0032-configs-rename-ls1043avnp_emmc_defconfig-to-ls1043av.patch \
        file://0033-armv8-ls1043ardb-rcw-add-rcw-for-emmc-and-nand.patch \
        file://0034-configs-ls1043avnprdb-Support-eMMC-and-NAND-boot.patch \
        file://0035-configs-ls1043avnprdb-Update-EEPROM-config.patch \
        file://0036-armv8-ls1043a-change-SoC-device-ID-to-detect-23-x-23.patch \
        file://0037-board-ls1043avnprdb-print-board-revision.patch \
        file://0038-dts-ls1043avnprdb-cosmetic-change.patch \
        file://0039-boards-ls1043avnprdb-configure-gpios.patch \
        file://0040-configs-ls1043avnprdb-disable-CONFIG_SPI_FLASH_BAR.patch \
        file://0041-ls1043avnprdb-enable-saveenv.patch \
        file://0042-board-fsl-ls1043avnprdb-modify-board-name-to-MPC-LS-.patch \
        file://0043-board-fsl-ls1043avnprdb-print-NAND-as-boot-source.patch \
        file://0044-configs-ls1043avnprdb-Enable-QSPI-programming-from-o.patch \
        file://0045-configs-ls1043avnprdb-enable-FDT_SEQ_MACADDR_FROM_EN.patch \
"
