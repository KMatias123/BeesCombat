package me.MartHus.BeesCombat;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.MartHus.BeesCombat.Commands.*;

public class CommandManager implements CommandExecutor{

	StartCombatCommand startCombat = new StartCombatCommand();
	StopCombatCommand stopCombat = new StopCombatCommand();
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		
		switch (label.toLowerCase())
		{
		case "startcombat":
			startCombat.cmd(sender, cmd, label, args);
			return true;
			
		case "stopcombat":
			stopCombat.cmd(sender, cmd, label, args);
			return true;
		}
		
		return false;
	}
	
}
