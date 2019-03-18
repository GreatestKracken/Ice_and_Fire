package com.github.alexthe666.iceandfire.integration.TinkersConstruct;

import com.github.alexthe666.iceandfire.core.ModItems;
import com.github.alexthe666.iceandfire.enums.EnumSeaSerpent;
import com.github.alexthe666.iceandfire.integration.TinkersConstruct.Traits.TraitAmphithere;
import com.github.alexthe666.iceandfire.integration.TinkersConstruct.Traits.TraitStymphalian;
import net.minecraft.item.ItemStack;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.*;
import slimeknights.tconstruct.library.traits.AbstractTrait;
import slimeknights.tconstruct.tools.TinkerTraits;

import static slimeknights.tconstruct.library.utils.HarvestLevels.*;

public class TinkersConstructCompat {

    // All the materials (currently) supported with Tinker's Construct
    public static Material materialDragonBone;
    public static Material materialAmphithereFeather;
    public static Material materialStymphalianBirdFeather;
    // All new traits added for parts
    public static final AbstractTrait traitAmphithere = new TraitAmphithere();
    public static final AbstractTrait traitStymphalian = new TraitStymphalian();

    static void preInit() {
        materialDragonBone = new Material("dragonbone", 0xC9C2B7, false);

        materialDragonBone.setCraftable(true).setCastable(false);
        materialDragonBone.addItem(ModItems.dragonbone, 1, Material.VALUE_Ingot * 2);
        materialDragonBone.addItem("boneDragon", 1, Material.VALUE_Ingot * 2);
        materialDragonBone.addItemIngot("boneDragon");
        materialDragonBone.setRepresentativeItem(new ItemStack(ModItems.dragonbone));

        materialDragonBone.addTrait(TinkerTraits.splitting, MaterialTypes.SHAFT);
        materialDragonBone.addTrait(TinkerTraits.fractured);

        TinkerRegistry.addMaterial(materialDragonBone);
        TinkerRegistry.addMaterialStats(materialDragonBone,
                new HeadMaterialStats(1000, 10.0f, 7.0f, COBALT),
                new BowMaterialStats(0.55f, 1.25f, 7),
                new ArrowShaftMaterialStats(1.5f, 10));



        materialAmphithereFeather = new Material("amphithere_feather", 0x1A977D, false);

        materialAmphithereFeather.setCraftable(true).setCastable(false);
        materialAmphithereFeather.addItem(ModItems.amphithere_feather, 1, Material.VALUE_Ingot);
        materialAmphithereFeather.setRepresentativeItem(new ItemStack(ModItems.amphithere_feather));

        materialAmphithereFeather.addTrait(traitAmphithere, MaterialTypes.FLETCHING);

        TinkerRegistry.addMaterial(materialAmphithereFeather);
        TinkerRegistry.addMaterialStats(materialAmphithereFeather,
                new FletchingMaterialStats(1.25f, 1.5f));



        materialStymphalianBirdFeather = new Material("stymphalian_bird_feather",0x7E5C45, false);

        materialStymphalianBirdFeather.setCraftable(true).setCastable(false);
        materialStymphalianBirdFeather.addItem(ModItems.stymphalian_bird_feather, 1, Material.VALUE_Ingot);
        materialStymphalianBirdFeather.setRepresentativeItem(new ItemStack(ModItems.stymphalian_bird_feather));

        materialStymphalianBirdFeather.addTrait(traitStymphalian, MaterialTypes.FLETCHING);

        TinkerRegistry.addMaterial(materialStymphalianBirdFeather);
        TinkerRegistry.addMaterialStats(materialStymphalianBirdFeather,
                new FletchingMaterialStats(1.5f, 0.75f));
    }
}
