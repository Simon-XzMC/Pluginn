package com.simonxz.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Plugin has been started!");
        // testing

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin has been disabled!");
    }
}
