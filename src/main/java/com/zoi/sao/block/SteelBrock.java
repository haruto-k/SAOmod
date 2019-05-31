package com.zoi.sao.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.Block;



public class SteelBrock extends Block {
    public SteelBrock(Material material) {
        super(material);
        this.setHardness(5.0F);//硬さの設定
        this.setResistance(10.0F);//爆破耐性の設定
        this.setStepSound(Block.soundTypeMetal);    //ブロックの上を歩いた時の音を登録する
        this.setHarvestLevel("pickaxe", 2); //回収するのに必要なツールを設定する。
        this.setLightLevel(0.0F);   //明るさの設定
    }
}