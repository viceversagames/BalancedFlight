package com.vice.balancedflight;

import com.simibubi.create.AllCreativeModeTabs;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.entry.RegistryEntry;
import com.vice.balancedflight.content.flightAnchor.FlightAnchorBlock;
import net.minecraft.world.level.block.Block;

public class AllBlocks
{
    static { BalancedFlight.registrate().useCreativeTab(AllCreativeModeTabs.MAIN_TAB); }

    public static final BlockEntry<? extends Block> FLIGHT_ANCHOR = FlightAnchorBlock.REGISTRY_ENTRY;

    public static void init() { }
}
