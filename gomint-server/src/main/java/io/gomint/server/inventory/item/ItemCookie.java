package io.gomint.server.inventory.item;

import io.gomint.inventory.item.ItemType;

import io.gomint.server.registry.RegisterInfo;
import io.gomint.taglib.NBTTagCompound;

/**
 * @author geNAZt
 * @version 1.0
 */
@RegisterInfo( id = 357 )
public class ItemCookie extends ItemFood implements io.gomint.inventory.item.ItemCookie {

    // CHECKSTYLE:OFF
    public ItemCookie( short data, int amount ) {
        super( 357, data, amount );
    }

    public ItemCookie( short data, int amount, NBTTagCompound nbt ) {
        super( 357, data, amount, nbt );
    }
    // CHECKSTYLE:ON

    @Override
    public float getSaturation() {
        return 0.1f;
    }

    @Override
    public float getHunger() {
        return 2;
    }

    @Override
    public ItemType getType() {
        return ItemType.COOKIE;
    }

}