package com.berlinxr.gercekkten;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Gercekkten extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
