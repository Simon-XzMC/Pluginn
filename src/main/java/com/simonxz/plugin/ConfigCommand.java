package com.simonxz.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class ConfigCommand implements CommandExecutor {

    private Plugin plugin;

    public ConfigCommand(Plugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player) {


            // Setting values to config when command runs
            //plugin.getConfig().set("Word", "Cake");
            //List<String> list = plugin.getConfig().getStringList("String-List");
            //list.add("New Value!");
            //plugin.getConfig().set("String-List", list);
            //plugin.saveConfig();


            // reading values from config when command runs
            Player player = (Player) commandSender;
            player.sendMessage(plugin.getConfig().getString("Word"));
            player.sendMessage(plugin.getConfig().getInt("Number" ) + "");
            if (plugin.getConfig().getBoolean("Boolean")) {
                player.sendMessage("This feature is enabled!");
            }
            for (String string : plugin.getConfig().getStringList("String-List")) {
                player.sendMessage(string);
            }


        }

        return false;
    }
}
