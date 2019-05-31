package com.zoi.sao;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;




@Mod
public class SAOmod {

    /*
    追加するアイテムの宣言
     */

    public static Item steel_ingot;
    public static Item black_ingot;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        /*
        アイテムの内容
         */

        /*
        GameRegistryへの登録
         */

        //Itemのインスタンスを生成し、代入する。
        steel_ingot = new Item()
                .setCreativeTab(CreativeTabs.tabMisc)  //クリエイティブタブの登録
                .setUnlocalizedName("steel_ingot")    //システム名の登録
                .setTextureName("SAOmod:steel_ingot");  //テクスチャ名の登録
                GameRegistry.registerItem(steel_ingot, "steel_ingot");
        black_ingot = new Item()
                .setCreativeTab(CreativeTabs.tabMisc)  //クリエイティブタブの登録
                .setUnlocalizedName("black_ingot")    //システム名の登録
                .setTextureName("SAOmod:black_ingot");  //テクスチャ名の登録
                GameRegistry.registerItem(steel_ingot, "black_ingot");

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        
    }

}
