package com.l****ey.uberhakes;

import net.minecraft.client.Minecraft;
import net.minecraft.src.*;

import com.l****ey.leleleleboolernz;

public class AutoSoup 
{
    //282 = filled soup
    //281 = bowl
    //276 = dia
    //267 = iron
    //283 = gold
    //272 = stone
    //268 = wood
    public static Minecraft mc = Minecraft.getMinecraft();
    public static boolean isSouping = false;
    public static boolean Fixed = false;
    
    public static void Handle() 
    {
        if(mc.thePlayer.getHealth() < 16 && !mc.thePlayer.capabilities.isCreativeMode)
        {
            Soup();
        }
        else
        {
            Sword();
        }
    }
    
    public static void Sword() 
    {        
        for(int slot = 44; slot >= 9; slot--) 
        {
            ItemStack stack = mc.thePlayer.inventoryContainer.getSlot(slot).getStack();
            
            if(stack != null) 
            {
                if(mc.thePlayer.inventory.currentItem != 276 && mc.thePlayer.inventory.hasItem(276))
                {
                    if(slot >= 36 && slot <= 44) 
                    {
                        if(stack.itemID  == 276) 
                        {
                            mc.thePlayer.inventory.currentItem = slot - 36;
                        }
                    } 
                    else if(stack.itemID == 276) 
                    {
                        mc.playerController.windowClick(0, slot, 0, 0, mc.thePlayer);
                        mc.playerController.windowClick(0, 37, 0, 0, mc.thePlayer);
                    }
                }
                else
                {
                    if(mc.thePlayer.inventory.currentItem != 267 && mc.thePlayer.inventory.hasItem(267))
                    {
                        if(slot >= 36 && slot <= 44) 
                        {
                            if(stack.itemID  == 267) 
                            {
                                mc.thePlayer.inventory.currentItem = slot - 36;
                            }
                        } 
                        else if(stack.itemID == 267) 
                        {
                            mc.playerController.windowClick(0, slot, 0, 0, mc.thePlayer);
                            mc.playerController.windowClick(0, 37, 0, 0, mc.thePlayer);
                        }
                    }
                    else
                    {
                        if(mc.thePlayer.inventory.currentItem != 283 && mc.thePlayer.inventory.hasItem(283))
                        {
                            if(slot >= 36 && slot <= 44) 
                            {
                                if(stack.itemID  == 283) 
                                {
                                    mc.thePlayer.inventory.currentItem = slot - 36;
                                }
                            } 
                            else if(stack.itemID == 283) 
                            {
                                mc.playerController.windowClick(0, slot, 0, 0, mc.thePlayer);
                                mc.playerController.windowClick(0, 37, 0, 0, mc.thePlayer);
                            }
                        }
                        else
                        {
                            if(mc.thePlayer.inventory.currentItem != 272 && mc.thePlayer.inventory.hasItem(272))
                            {
                                if(slot >= 36 && slot <= 44) 
                                {
                                    if(stack.itemID  == 272) 
                                    {
                                        mc.thePlayer.inventory.currentItem = slot - 36;
                                    }
                                } 
                                else if(stack.itemID == 272) 
                                {
                                    mc.playerController.windowClick(0, slot, 0, 0, mc.thePlayer);
                                    mc.playerController.windowClick(0, 37, 0, 0, mc.thePlayer);
                                }
                            }
                            else
                            {
                                if(mc.thePlayer.inventory.currentItem != 268 && mc.thePlayer.inventory.hasItem(268))
                                {
                                    if(slot >= 36 && slot <= 44) 
                                    {
                                        if(stack.itemID  == 268) 
                                        {
                                            mc.thePlayer.inventory.currentItem = slot - 36;
                                        }
                                    } 
                                    else if(stack.itemID == 268) 
                                    {
                                        mc.playerController.windowClick(0, slot, 0, 0, mc.thePlayer);
                                        mc.playerController.windowClick(0, 37, 0, 0, mc.thePlayer);
                                    }
                                }
                            }
                        }
                    }
                }    
            }
        }
    }

    public static void Soup() 
    {        
        for(int slot = 44; slot >= 9; slot--) 
        {
            ItemStack stack = mc.thePlayer.inventoryContainer.getSlot(slot).getStack();
            
            
            if(stack != null) 
            {
                if(mc.thePlayer.inventory.currentItem != 282 && mc.thePlayer.inventory.hasItem(282))
                {
                    if(slot >= 36 && slot <= 44) 
                    {
                        if(stack.itemID  == 282) 
                        {
                            mc.thePlayer.inventory.currentItem = slot - 36;
                            mc.thePlayer.sendQueue.addToSendQueue(new Packet15Place(-1, -1, -1, -1, mc.thePlayer.inventory.getCurrentItem(), 0F, 0F, 0F));
                        }
                    } 
                    else if(stack.itemID == 282) 
                    {
                        mc.playerController.windowClick(0, slot, 0, 0, mc.thePlayer);
                        mc.playerController.windowClick(0, 37, 0, 0, mc.thePlayer);
                    }
                }
                
            }
        }
    }

    
}