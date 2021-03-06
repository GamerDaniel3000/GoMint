/*
 * Copyright (c) 2017, GoMint, BlackyPaw and geNAZt
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.server.entity.potion.effect;

import io.gomint.server.entity.EntityLiving;

/**
 * @author geNAZt
 * @version 1.0
 */
public class FireResistance extends Effect {

    public FireResistance( int amplifier, long runoutTimer ) {
        super( amplifier, runoutTimer );
    }

    @Override
    public void apply( EntityLiving entity ) {

    }

    @Override
    public void update( long currentTimeMillis, float dT ) {

    }

    @Override
    public void remove( EntityLiving entity ) {

    }

}
