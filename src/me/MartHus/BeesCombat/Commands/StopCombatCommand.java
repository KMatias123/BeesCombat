package me.MartHus.BeesCombat.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.MartHus.BeesCombat.Main;

public class StopCombatCommand implements CommandExecutor {

	Main main = new Main();
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
	{
		if (sender instanceof Player)
		{
			Player player = (Player) sender;
			
			player.getInventory().clear();
		}
		
		Main.combatEnabled = false;
		sender.sendMessage("Combat is now: " + Main.combatEnabled);
		sender.sendMessage(ChatColor.GOLD + "Hope you had fun! :)");
		return true;
	}
}
