package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( id = 433 )
 public class ItemPoppedChorusFruit extends ItemStack implements io.gomint.inventory.item.ItemPoppedChorusFruit {

    // CHECKSTYLE:OFF
    public ItemPoppedChorusFruit( short data, int amount ) {
        super( 433, data, amount );
    }

    public ItemPoppedChorusFruit( short data, int amount, NBTTagCompound nbt ) {
        super( 433, data, amount, nbt );
    }
    // CHECKSTYLE:ON

    @Override
    public ItemType getType() {
        return ItemType.POPPED_CHORUS_FRUIT;
    }

}