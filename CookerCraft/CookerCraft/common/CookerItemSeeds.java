package CookerCraft.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class CookerItemSeeds extends ItemSeeds {
	private String UnocalizedName;
	public CookerItemSeeds(int par1, int par2) {
		super(par1, par2, Block.tilledField.blockID);
		// TODO Auto-generated constructor stub
	}
	@Override
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(CookerCraft.ModName+":"+this.UnocalizedName);
    }
	

	@Override
	public Item setUnlocalizedName(String par1Str) {
		this.UnocalizedName=par1Str;
		return super.setUnlocalizedName(par1Str);
	}

}
