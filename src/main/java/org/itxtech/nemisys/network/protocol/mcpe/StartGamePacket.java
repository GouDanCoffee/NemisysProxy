package org.itxtech.nemisys.network.protocol.mcpe;

public class StartGamePacket extends DataPacket {

    @Override
    public byte pid() {
        return ProtocolInfo.START_GAME_PACKET;
    }

    public long entityUniqueId;
    public long entityRuntimeId;
    public int playerGamemode;
    public float x;
    public float y;
    public float z;
    public float yaw;
    public float pitch;
    public int seed;
    public byte dimension;
    public int generator = 1;
    public int worldGamemode;
    public int difficulty;
    public int spawnX;
    public int spawnY;
    public int spawnZ;
    public boolean hasAchievementsDisabled = true;
    public int dayCycleStopTime = -1;
    public boolean eduMode = false;
    public boolean hasEduFeaturesEnabled = false;
    public float rainLevel;
    public float lightningLevel;
    public boolean multiplayerGame = true;
    public boolean broadcastToLAN = true;
    public boolean broadcastToXboxLive = true;
    public boolean commandsEnabled;
    public boolean isTexturePacksRequired = false;
    public boolean bonusChest = false;
    public boolean trustPlayers = false;
    public int permissionLevel = 1;
    public int gamePublish = 4;
    public int serverChunkTickRange = 4;
    public boolean broadcastToPlatform;
    public int platformBroadcastMode = 4;
    public boolean xblBroadcastIntent = true;
    public boolean hasLockedBehaviorPack = false;
    public boolean hasLockedResourcePack = false;
    public boolean isFromLockedWorldTemplate = false;
    public boolean isUsingMsaGamertagsOnly = false;
    public String levelId = "";
    public String worldName;
    public String premiumWorldTemplateId = "";
    public boolean unknown = false;
    public long currentTick;
    public int enchantmentSeed;
    public String multiplayerCorrelationId = "";

    @Override
    public void decode() {
    }

    @Override
    public void encode() {
        this.reset();
        this.putEntityUniqueId(this.entityUniqueId);
        this.putEntityRuntimeId(this.entityRuntimeId);
        this.putVarInt(this.playerGamemode);
        this.putVector3f(this.x, this.y, this.z);
        this.putLFloat(this.yaw);
        this.putLFloat(this.pitch);
        this.putVarInt(this.seed);
        this.putVarInt(this.dimension);
        this.putVarInt(this.generator);
        this.putVarInt(this.worldGamemode);
        this.putVarInt(this.difficulty);
        this.putBlockVector3(this.spawnX, this.spawnY, this.spawnZ);
        this.putBoolean(this.hasAchievementsDisabled);
        this.putVarInt(this.dayCycleStopTime);
        this.putBoolean(this.eduMode);
        this.putBoolean(this.hasEduFeaturesEnabled);
        this.putLFloat(this.rainLevel);
        this.putLFloat(this.lightningLevel);
        this.putBoolean(this.multiplayerGame);
        this.putBoolean(this.broadcastToLAN);
        this.putBoolean(this.broadcastToXboxLive);
        this.putBoolean(this.commandsEnabled);
        this.putBoolean(this.isTexturePacksRequired);
        this.putUnsignedVarInt(0);
        this.putBoolean(this.bonusChest);
        this.putBoolean(this.trustPlayers);
        this.putVarInt(this.permissionLevel);
        this.putVarInt(this.gamePublish);
        this.putLInt(this.serverChunkTickRange);
        this.putBoolean(this.broadcastToPlatform);
        this.putUnsignedVarInt(this.platformBroadcastMode);
        this.putBoolean(this.xblBroadcastIntent);
        this.putBoolean(this.hasLockedBehaviorPack);
        this.putBoolean(this.hasLockedResourcePack);
        this.putBoolean(this.isFromLockedWorldTemplate);
        this.putString(this.levelId);
        this.putString(this.worldName);
        this.putString(this.premiumWorldTemplateId);
        this.putBoolean(this.isUsingMsaGamertagsOnly);
        this.putBoolean(this.unknown);
        this.putLLong(this.currentTick);
        this.putVarInt(this.enchantmentSeed);
        this.putUnsignedVarInt(0);
        this.putString(this.multiplayerCorrelationId);
    }
}
