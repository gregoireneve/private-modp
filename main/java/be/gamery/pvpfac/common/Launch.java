package be.gamery.pvpfac.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import be.gamery.pvpfac.proxy.*;

@Mod(modid = "pvpfac", name = "Gamery mod pvpfac", version = "1.0.0")

public class Launch
{
	@Instance(be.gamery.pvpfac.info.Info.MODID)
	public static Launch instance;

	@SidedProxy(clientSide = "be.gamery.pvpfac.proxy.Clientproxy", serverSide = "be.gamery.pvpfac.proxy.Commonproxy")
	public static Commonproxy proxy;
 public static Item sword;
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		item.Sword.init();
		item.Sword.register();
		item.utils.axe.init();
		item.utils.axe.register();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRender();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
} 