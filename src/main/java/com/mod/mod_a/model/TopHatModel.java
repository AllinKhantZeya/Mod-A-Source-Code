// Date: 12/25/2015 10:48:28 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.mod.mod_a.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class TopHatModel extends ModelBiped
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
  
    public TopHatModel()
    {
      textureWidth = 64;
      textureHeight = 32;
      
        Shape1 = new ModelRenderer(this, 0, 0);
        Shape1.addBox(-4F, -8F, -5F, 8, 2, 1);
        Shape1.setTextureSize(64, 32);
        Shape1.mirror = true;
        this.bipedHead.addChild(Shape1);
        
        Shape2 = new ModelRenderer(this, 0, 0);
        Shape2.addBox(-4F, -8F, 4F, 8, 2, 1);
        Shape2.setTextureSize(64, 32);
        Shape2.mirror = true;
        this.bipedHead.addChild(Shape2);
        
        Shape3 = new ModelRenderer(this, 0, 0);
        Shape3.addBox(4F, -8F, -4F, 1, 2, 8);
        Shape3.setTextureSize(64, 32);
        Shape3.mirror = true;
        this.bipedHead.addChild(Shape3);
        
        Shape4 = new ModelRenderer(this, 0, 0);
        Shape4.addBox(-5F, -8F, -4F, 1, 2, 8);
        Shape4.setTextureSize(64, 32);
        Shape4.mirror = true;
        this.bipedHead.addChild(Shape4);
        
        Shape5 = new ModelRenderer(this, 0, 0);
        Shape5.addBox(-4F, -14F, -4F, 8, 6, 8);
        Shape5.setTextureSize(64, 32);
        Shape5.mirror = true;
        this.bipedHead.addChild(Shape5);
    }
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
    	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Shape1.render(f5);
        Shape2.render(f5);
        Shape3.render(f5);
        Shape4.render(f5);
        Shape5.render(f5);
    }
}
