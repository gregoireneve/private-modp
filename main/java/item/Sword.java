package item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class Sword extends Item{
public static Item sword;
public static void init() {
	sword = new Sword().setCreativeTab(CreativeTabs.tabCombat).setUnlocalizedName("sword").setTextureName(be.gamery.pvpfac.info.Info.MODID + ":sword");
}
public static void register() {
	GameRegistry.registerItem(sword, "sword");

}
}
