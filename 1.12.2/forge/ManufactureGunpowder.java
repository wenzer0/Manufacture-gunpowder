
package com.lingzhihe.manufacturegunpowder;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
    modid = "manufacturegunpowder",
    name = "Manufacture Gunpowder",
    version = "0.2.0",
    acceptedMinecraftVersions = "[1.12,1.13)"
)
public class ManufactureGunpowder {

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // coal (meta 0) -> gunpowder
        GameRegistry.addSmelting(new ItemStack(Items.field_151044_h, 1, 0),
                new ItemStack(Items.field_151016_H), 0.1F);
        // charcoal = coal meta 1 -> gunpowder
        GameRegistry.addSmelting(new ItemStack(Items.field_151044_h, 1, 1),
                new ItemStack(Items.field_151016_H), 0.1F);
        System.out.println("[Manufacture Gunpowder] Recipes registered: coal/charcoal -> gunpowder (smelting)");
    }
}
