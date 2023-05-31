package com.simonxz.plugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GodCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        Player player = (Player) commandSender;

        if(commandSender instanceof Player) {
            // if 1st args = on turns god on
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("on")) {
                    if (player.hasPermission("plugin.god")) {
                        player.sendTitle(ChatColor.GOLD + "You are now in god!", "");
                        player.setInvulnerable(true);
                    } else {
                        player.sendMessage(ChatColor.RED + "You don't have permission");
                    }
                }
            }
            // if 1st args = off turns god off
            if (args.length == 1) {
                if (args[0].equalsIgnoreCase("off")) {
                    if (player.hasPermission("plugin.god")) {
                        player.sendTitle(ChatColor.GOLD + "You are no longer in god!", "");
                        player.setInvulnerable(false);
                    } else {
                        player.sendMessage(ChatColor.RED + "You don't have permission");
                    }
                }
            }
        }
        return false;
    }
}
