package com.berlinxr.gercekkten;

import org.bukkit.entity.Cow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class Events implements Listener {
    @EventHandler
    public void PlayerMoveEvent(PlayerMoveEvent x) {
        Player p = x.getPlayer();
        p.getWorld().spawn(p.getLocation(), Cow.class);
    }

}
