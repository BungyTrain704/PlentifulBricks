package com.austinplays.plentifulbricks.block;

import com.austinplays.plentifulbricks.PlentifulBricks;
import com.austinplays.plentifulbricks.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PlentifulBricks.MOD_ID);

    public static final RegistryObject<Block> SMOOTH_STONE_BRICKS = registerBlock("smooth_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)));

    public static final RegistryObject<Block> PACKED_MUD_BRICKS = registerBlock("packed_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PACKED_MUD)));

    public static final RegistryObject<Block> PURPUR_BRICKS = registerBlock("purpur_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)));

    public static final RegistryObject<Block> BONE_BRICKS = registerBlock("bone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BONE_BLOCK)));

    public static final RegistryObject<Block> DARK_PRISMARINE_BRICKS = registerBlock("dark_prismarine_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE)));

    public static final RegistryObject<Block> GILDED_BLACKSTONE_BRICKS = registerBlock("gilded_blackstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GILDED_BLACKSTONE)));

    public static final RegistryObject<Block> SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));

    public static final RegistryObject<Block> RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE)));

    public static final RegistryObject<Block> COAL_BRICKS = registerBlock("coal_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK)));

    public static final RegistryObject<Block> IRON_BRICKS = registerBlock("iron_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> GOLD_BRICKS = registerBlock("gold_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK)));

    public static final RegistryObject<Block> DIAMOND_BRICKS = registerBlock("diamond_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK)));

    public static final RegistryObject<Block> EMERALD_BRICKS = registerBlock("emerald_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK)));

    public static final RegistryObject<Block> LAPIS_BRICKS = registerBlock("lapis_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK)));

    public static final RegistryObject<Block> NETHERITE_BRICKS = registerBlock("netherite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> COPPER_BRICKS = registerBlock("copper_bricks",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK)));

    public static final RegistryObject<Block> EXPOSED_COPPER_BRICKS = registerBlock("exposed_copper_bricks",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_COPPER)));

    public static final RegistryObject<Block> WEATHERED_COPPER_BRICKS = registerBlock("weathered_copper_bricks",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.WEATHERED,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_COPPER)));

    public static final RegistryObject<Block> OXIDIZED_COPPER_BRICKS = registerBlock("oxidized_copper_bricks",
            () -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.OXIDIZED,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_COPPER)));

    public static final RegistryObject<Block> POLISHED_TUFF_BRICKS = registerBlock("polished_tuff_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_TUFF)));

    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICKS = registerBlock("polished_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)));

    public static final RegistryObject<Block> POLISHED_DIORITE_BRICKS = registerBlock("polished_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)));

    public static final RegistryObject<Block> POLISHED_GRANITE_BRICKS = registerBlock("polished_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)));

    public static final RegistryObject<Block> SMOOTH_BASALT_BRICKS = registerBlock("smooth_basalt_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_BASALT)));

    public static final RegistryObject<Block> BASALT_BRICKS = registerBlock("basalt_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT)));

    public static final RegistryObject<Block> OBSIDIAN_BRICKS = registerBlock("obsidian_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.OBSIDIAN)));

    public static final RegistryObject<Block> DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> AMETHYST_BRICKS = registerBlock("amethyst_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

    public static final RegistryObject<Block> SNOW_BRICKS = registerBlock("snow_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW_BLOCK)));

    public static final RegistryObject<Block> NETHERRACK_BRICKS = registerBlock("netherrack_bricks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK)));


    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {BLOCKS.register(eventBus);
    }
}