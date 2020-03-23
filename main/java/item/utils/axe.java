package item.utils;

import cpw.mods.fml.common.registry.GameRegistry;
import item.utils.itemclass.axearonide;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class axe {
public static Item argonideaxe;
public static ToolMaterial argnitelevels = EnumHelper.addToolMaterial("argonitelevels", 3, 854, 12.0F, 12.0F, 18); 
public static void init() {
	argonideaxe = new argon_axe(argnitelevels).setUnlocalizedName("argoniteaxe").setTextureName(be.gamery.pvpfac.info.Info.MODID + ":argonpickaxe").setCreativeTab(CreativeTabs.tabTools);
}
public static void register() {
	GameRegistry.registerItem(argonideaxe, "item_tuto_sword");	
}
}