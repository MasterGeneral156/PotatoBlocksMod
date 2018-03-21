package com.themastergeneral.potatoblocks;

import org.apache.logging.log4j.Logger;

import com.themastergeneral.potatoblocks.proxy.Common;

import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = PotatoBlocks.MODID, name = PotatoBlocks.MODNAME, version = PotatoBlocks.VERSION, acceptedMinecraftVersions = PotatoBlocks.acceptedMinecraftVersions, updateJSON = PotatoBlocks.updateJSON, certificateFingerprint = PotatoBlocks.certificateFingerprint, dependencies = PotatoBlocks.DEPENDENCIES)
public class PotatoBlocks {
	public static final String MODID = "potatoblocks";
	public static final String MODNAME = "Potato Blocks";
	public static final String VERSION = "1.0.0";
	// Update JSON link
	public static final String updateJSON = "https://raw.githubusercontent.com/MasterGeneral156/Version/master/PotatoBlocks.json";
	public static final String acceptedMinecraftVersions = "1.12.2";
	// TMG's public key
	public static final String certificateFingerprint = "1cd8befc36d6dedc5601d77a013f43afc71f899f";
	// Required after CTD Core
	// [https://minecraft.curseforge.com/projects/ctd-core]
	public static final String DEPENDENCIES = "required-after:ctdcore@[1.2.5,];";

	@Instance
	public static PotatoBlocks instance = new PotatoBlocks();

	@SidedProxy(clientSide = "com.themastergeneral.potatoblocks.proxy.Client", serverSide = "com.themastergeneral.potatoblocks.proxy.Server")
	public static Common proxy;
	public static Logger logger;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		logger = e.getModLog();
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}

	@EventHandler
	public void onFingerprintViolation(FMLFingerprintViolationEvent e) {
		FMLLog.warning("Invalid fingerprint detected for Potato Blocks! TheMasterGeneral will not support this version!");
	}
}
