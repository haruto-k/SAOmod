package com.zoi.sao;

import com.zoi.sao.block.BrackBrock;
import com.zoi.sao.block.SteelBrock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.ItemStack;






@Mod(modid = "SAOmod", name = "SAOmod", version = "alpha_0.0.1")
public class SAOmod {

    /*
    追加するアイテムの宣言
     */
    public static Item steel_ingot;
    public static Item black_ingot;

    /*
    追加するブロックの宣言
     */
    public static Block block_steel;
    public static Block block_black;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        /*
        アイテムの内容
        GameRegistryへの登録
         */

        //Itemのインスタンスを生成し、代入する。
        steel_ingot = new Item()
                .setUnlocalizedName("steel_ingot")    //システム名の登録
                .setTextureName("SAOmod:steel_ingot");  //テクスチャ名の登録
                GameRegistry.registerItem(steel_ingot, "steel_ingot");
        black_ingot = new Item()
                .setUnlocalizedName("black_ingot")    //システム名の登録
                .setTextureName("SAOmod:black_ingot");  //テクスチャ名の登録
                GameRegistry.registerItem(steel_ingot, "black_ingot");

        //Blockのインスタンスを生成し、代入する。
        block_steel = new SteelBrock(Material.rock)
                .setBlockName("blockAluminium")//システム名の登録
                .setBlockTextureName("SAOmod:block_steel");//テクスチャ名の登録
                GameRegistry.registerBlock(block_steel, "block_steel");
        block_black = new BrackBrock(Material.rock)
                .setBlockName("blockAluminium")//システム名の登録
                .setBlockTextureName("SAOmod:block_steel");//テクスチャ名の登録
                GameRegistry.registerBlock(block_steel, "block_steel");


    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        /*
        定型レシピの追加
         */
        GameRegistry.addRecipe(new ItemStack(SAOmod.steel_ingot),"XXX", "XXX", "XXX", 'X', SAOmod.block_steel);
        GameRegistry.addRecipe(new ItemStack(SAOmod.black_ingot),"XXX", "XXX", "XXX", 'X', SAOmod.block_black);

        /*
        精錬レシピの追加
         */
        GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(SAOmod.steel_ingot), 0.8F);    //鉄　スチールインゴット
        GameRegistry.addSmelting(SAOmod.steel_ingot, new ItemStack(SAOmod.black_ingot), 0.8F);  //スチールインゴット　ブラックインゴット
    }

}
