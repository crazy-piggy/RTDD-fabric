package com.intellij.rtdd;

import com.intellij.rtdd.registry.*;
import com.intellij.rtdd.util.RTDDConstant;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RTDDMain implements ModInitializer {
    public static final String MODID = "rtdd";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        RTDDBlockEntityType.registerModBlockEntityType();
        RTDDItems.registerModItem();
        RTDDBlocks.registerModBlock();
        RTDDBlockItems.registerModBlockItems();
        RTDDItemTags.registerModItemTags();
        RTDDBlockTags.registerModBlockTags();
        RTDDItemGroups.registerModItemGroup();
        //RTDDScreenHandlerType.registerModBlockEntityType();
        //RTDDRecipeType.registerModBlockEntityType();
        //RTDDRecipeSerializer.registerModBlockEntityType();
        //RTDDLootTableModifier.registerModModifyLootTable();
        RTDDSoundEvents.registerModSoundEvent();
        RTDDConstant.initConstant();


    }
}