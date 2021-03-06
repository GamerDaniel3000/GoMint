package io.gomint.server.inventory.item.generator;

import io.gomint.server.inventory.item.ItemPrismarineShard;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
public class ItemPrismarineShardGenerator implements ItemGenerator {

   @Override
   public ItemPrismarineShard generate( short data, byte amount, NBTTagCompound nbt ) {
       return new ItemPrismarineShard( data, amount, nbt );
   }

   @Override
   public ItemPrismarineShard generate( short data, byte amount ) {
       return new ItemPrismarineShard( data, amount );
   }

}
