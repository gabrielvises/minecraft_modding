package com.gablong.gmod.client.render.model;


import com.gablong.gmod.common.entities.ExampleEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ExampleEntityModel<T extends ExampleEntity> extends EntityModel<T> {
//        private final ModelRenderer bb_main;
    private final ModelRenderer rightLeg2;
    private final ModelRenderer body;
    private final ModelRenderer leftArm;
    private final ModelRenderer head;
    private final ModelRenderer rightLeg;
    private final ModelRenderer rightArm;

        public ExampleEntityModel() {
            texHeight = 32;
            texWidth = 32;

            rightLeg2 = new ModelRenderer(this);
            rightLeg2.setPos(0.0F, 24.0F, 0.0F);
            rightLeg2.setTexSize(0, 0).addBox(1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
            rightLeg2.setTexSize(0, 0).addBox(1.0F, -11.0F, 1.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
            rightLeg2.setTexSize(0, 0).addBox(3.0F, -11.0F, -1.0F, 1.0F, 5.0F, 3.0F, 0.0F, false);
            rightLeg2.setTexSize(0, 0).addBox(1.0F, -11.0F, -2.0F, 3.0F, 5.0F, 1.0F, 0.0F, false);

            body = new ModelRenderer(this);
            body.setPos(0.0F, 24.0F, 0.0F);
            body.setTexSize(0, 0).addBox(-4.0F, -28.0F, -2.0F, 8.0F, 17.0F, 5.0F, 0.0F, false);
            body.setTexSize(0, 0).addBox(-4.0F, -28.0F, -4.0F, 8.0F, 11.0F, 2.0F, 0.0F, false);
            body.setTexSize(0, 0).addBox(4.0F, -28.0F, -4.0F, 4.0F, 7.0F, 7.0F, 0.0F, false);
            body.setTexSize(0, 0).addBox(-8.0F, -28.0F, -4.0F, 4.0F, 7.0F, 7.0F, 0.0F, false);
            body.setTexSize(0, 0).addBox(-8.0F, -28.0F, -5.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
            body.setTexSize(0, 0).addBox(1.0F, -28.0F, -5.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
            body.setTexSize(0, 0).addBox(0.0F, -20.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
            body.setTexSize(0, 0).addBox(0.0F, -18.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
            body.setTexSize(0, 0).addBox(-4.0F, -18.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
            body.setTexSize(0, 0).addBox(-4.0F, -20.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
            body.setTexSize(0, 0).addBox(-6.0F, -21.0F, -4.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);
            body.setTexSize(0, 0).addBox(4.0F, -21.0F, -4.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);

            leftArm = new ModelRenderer(this);
            leftArm.setPos(0.0F, 24.0F, 0.0F);
            leftArm.setTexSize(0, 0).addBox(-13.0F, -29.0F, -3.0F, 5.0F, 10.0F, 5.0F, 0.0F, false);
            leftArm.setTexSize(0, 0).addBox(-12.0F, -19.0F, -3.0F, 3.0F, 10.0F, 2.0F, 0.0F, false);
            leftArm.setTexSize(0, 0).addBox(-12.0F, -19.0F, -1.0F, 3.0F, 7.0F, 1.0F, 0.0F, false);

            head = new ModelRenderer(this);
            head.setPos(0.0F, 24.0F, 0.0F);
            head.setTexSize(5, 15).addBox(-4.0F, -32.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
            head.setTexSize(0, 0).addBox(-2.0F, -35.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
            head.setTexSize(0, 0).addBox(-4.0F, -29.0F, -3.0F, 8.0F, 1.0F, 5.0F, 0.0F, false);

            rightLeg = new ModelRenderer(this);
            rightLeg.setPos(0.0F, 24.0F, 0.0F);
            rightLeg.setTexSize(0, 0).addBox(-3.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, true);
            rightLeg.setTexSize(0, 0).addBox(-3.0F, -11.0F, 1.0F, 2.0F, 6.0F, 1.0F, 0.0F, true);
            rightLeg.setTexSize(0, 0).addBox(-4.0F, -11.0F, -1.0F, 1.0F, 5.0F, 3.0F, 0.0F, true);
            rightLeg.setTexSize(0, 0).addBox(-4.0F, -11.0F, -2.0F, 3.0F, 5.0F, 1.0F, 0.0F, true);

            rightArm = new ModelRenderer(this);
            rightArm.setPos(21.0F, 24.0F, 0.0F);
            rightArm.setTexSize(0, 0).addBox(-13.0F, -29.0F, -3.0F, 5.0F, 10.0F, 5.0F, 0.0F, false);
            rightArm.setTexSize(0, 0).addBox(-12.0F, -19.0F, -3.0F, 3.0F, 10.0F, 2.0F, 0.0F, false);
            rightArm.setTexSize(0, 0).addBox(-12.0F, -19.0F, -1.0F, 3.0F, 7.0F, 1.0F, 0.0F, false);
        }



    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
//            bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        rightLeg2.render(matrixStack, buffer, packedLight, packedOverlay);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
    }




    @Override
    public void setupAnim(ExampleEntity entity, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_) {

    }


}

