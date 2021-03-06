package io.gomint.server.network.packet;

import io.gomint.inventory.item.ItemStack;
import io.gomint.jraknet.PacketBuffer;
import io.gomint.server.entity.EntityLink;
import io.gomint.server.entity.metadata.MetadataContainer;
import io.gomint.server.network.Protocol;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.UUID;

/**
 * @author geNAZt
 * @version 1.1
 */
@EqualsAndHashCode( callSuper = false )
@Data
public class PacketSpawnPlayer extends Packet {

    private UUID uuid;
    private String name;
    private String thirdPartyName = "";  // TODO: Find out if this is some sort of nickname function
    private int platformID;         // TODO: The heck is this? (I guess the servers platform?)
    private long entityId;
    private long runtimeEntityId;

    private String unknown = "";    // TODO: What is this?

    private float x;
    private float y;
    private float z;

    private float velocityX;
    private float velocityY;
    private float velocityZ;

    private float pitch;
    private float headYaw;
    private float yaw;

    private ItemStack itemInHand;
    private MetadataContainer metadataContainer;

    // Some adventure stuff? Yep this is adventure setting stuff
    private int flags;
    private int commandPermission;
    private int flags2;
    private int playerPermission;
    private int customFlags;

    private List<EntityLink> links;

    /**
     * Create a new spawn player packet
     */
    public PacketSpawnPlayer() {
        super( Protocol.PACKET_SPAWN_PLAYER );
    }

    @Override
    public void serialize( PacketBuffer buffer, int protocolID ) {
        buffer.writeUUID( this.uuid );
        buffer.writeString( this.name );

        buffer.writeString( this.thirdPartyName );
        buffer.writeSignedVarInt( this.platformID );

        buffer.writeSignedVarLong( this.entityId );
        buffer.writeUnsignedVarLong( this.runtimeEntityId );

        buffer.writeString( this.unknown );

        buffer.writeLFloat( this.x );
        buffer.writeLFloat( this.y );
        buffer.writeLFloat( this.z );

        buffer.writeLFloat( this.velocityX );
        buffer.writeLFloat( this.velocityY );
        buffer.writeLFloat( this.velocityZ );

        buffer.writeLFloat( this.pitch );
        buffer.writeLFloat( this.headYaw );
        buffer.writeLFloat( this.yaw );

        writeItemStack( this.itemInHand, buffer );
        this.metadataContainer.serialize( buffer );

        buffer.writeUnsignedVarInt( this.flags );
        buffer.writeUnsignedVarInt( this.commandPermission );
        buffer.writeUnsignedVarInt( this.flags2 );
        buffer.writeUnsignedVarInt( this.playerPermission );
        buffer.writeUnsignedVarInt( this.customFlags );

        buffer.writeLLong( this.entityId );

        writeEntityLinks( this.links, buffer );
    }

    @Override
    public void deserialize( PacketBuffer buffer, int protocolID ) {

    }

}
