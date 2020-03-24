package com.massivecraft.factions;

import com.massivecraft.factions.data.json.JSONFPlayers;
import com.massivecraft.factions.data.mysql.MySqlFPlayers;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.Collection;

public abstract class FPlayers {
    protected static FPlayers instance = getFPlayersImpl();

    public abstract void clean();

    public static FPlayers getInstance() {
        return instance;
    }

    private static FPlayers getFPlayersImpl() {
        String dataType = FactionsPlugin.getInstance().conf().data().getStorageType().toLowerCase(); // because what's the chances someone types MySql or mysql
        switch (dataType) {
            case "mysql":
                return new MySqlFPlayers();
            case "json":
                return new JSONFPlayers();
            default:
                throw new RuntimeException("The specified datatype is undefined.");
        }
    }

    public abstract Collection<FPlayer> getOnlinePlayers();

    public abstract FPlayer getByPlayer(Player player);

    public abstract Collection<FPlayer> getAllFPlayers();

    public abstract void forceSave();

    public abstract void forceSave(boolean sync);

    public abstract FPlayer getByOfflinePlayer(OfflinePlayer player);

    public abstract FPlayer getById(String string);

    public abstract int load();


}
