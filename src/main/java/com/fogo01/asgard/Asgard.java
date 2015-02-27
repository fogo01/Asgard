package com.fogo01.asgard;

import com.fogo01.asgard.init.ModBlocks;
import com.fogo01.asgard.init.ModItems;
import com.fogo01.asgard.init.Recipies;
import com.fogo01.asgard.proxy.IProxy;
import com.fogo01.asgard.reference.Reference;
import com.fogo01.asgard.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.FMLCommonHandler;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERISION)
public class Asgard {
    @Mod.Instance(Reference.MOD_ID)
    public static Asgard instance;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;



    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        //ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        //FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre Initialization Complete!");
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        Recipies.init();

        LogHelper.info("Initialization Complete!");
    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

        LogHelper.info("Post Initialization Complete!");
    }
}
