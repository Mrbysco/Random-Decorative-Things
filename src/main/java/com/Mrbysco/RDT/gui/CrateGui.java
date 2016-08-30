package com.Mrbysco.RDT.gui;

import com.Mrbysco.RDT.RDTReference;
import com.Mrbysco.RDT.container.CrateContainer;
import com.Mrbysco.RDT.tileentity.TileEntityCrate;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;

public class CrateGui extends GuiContainer {
	public static final int WIDTH = 180;
    public static final int HEIGHT = 152;

    private static final ResourceLocation background = new ResourceLocation(RDTReference.MOD_ID, "textures/gui/cratecontainer.png");

    public CrateGui(TileEntityCrate tileEntity, CrateContainer container) {
        super(container);

        xSize = WIDTH;
        ySize = HEIGHT;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        mc.getTextureManager().bindTexture(background);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
}
