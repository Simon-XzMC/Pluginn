package com.simonxz.plugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;
            player.sendMessage(ChatColor.GREEN + "You have been healed!");
            player.setHealth(20);
            player.setFoodLevel(20);
            player.sendTitle(ChatColor.AQUA + "You have been healed!", ChatColor.GOLD + "You have been fed!");

            player.setInvulnerable(true);
        }

        return false;
    }
}
