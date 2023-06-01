package com.simonxz.plugin;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("god").setExecutor(new GodCommand());
        getCommand("config").setExecutor(new ConfigCommand(this));

        getConfig().options().copyDefaults();
        saveDefaultConfig();

    }



    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }
}
