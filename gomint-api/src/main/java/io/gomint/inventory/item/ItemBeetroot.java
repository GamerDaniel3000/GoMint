package io.gomint.inventory.item;

import io.gomint.GoMint;

/**
 * @author geNAZt
 * @version 1.0
 */
public interface ItemBeetroot extends ItemFood {

    /**
     * Create a new item stack with given class and amount
     *
     * @param amount which is used for the creation
     */
    static ItemBeetroot create( int amount ) {
        return GoMint.instance().createItemStack( ItemBeetroot.class, amount );
    }

}
