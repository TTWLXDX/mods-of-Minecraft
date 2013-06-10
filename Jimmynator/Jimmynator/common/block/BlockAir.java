package Jimmynator.common.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Jimmynator.common.Jimmynator;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.particle.EffectRenderer;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class BlockAir extends Block {

	public BlockAir(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setBlockBounds(0, 0, 0, 0, 0, 0);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getBlockTextureFromSideAndMetadata(int par1, int par2) {
	
		return null;
	}
	@Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }


	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return 0;
	}





	@Override
    public boolean isOpaqueCube()
    {
        return false;
    }
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {

	}

	@Override
	public int getRenderType() {
		return -1;
	}
	

}
