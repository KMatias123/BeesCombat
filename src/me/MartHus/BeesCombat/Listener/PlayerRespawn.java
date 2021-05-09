package me.MartHus.BeesCombat.Listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

import me.MartHus.BeesCombat.Items;
import me.MartHus.BeesCombat.Main;

public class PlayerRespawn implements Listener {
	
	Main main = new Main();
	Items items = new Items();
	
	@EventHandler
	public void playerRespawn (PlayerRespawnEvent event)
	{
		Player player = event.getPlayer();
		
		player.sendMessage("Player respawned");
		
		if (Main.combatEnabled == true)	
			items.giveItems(player);
		
		player.sendMessage("combat is: " + Main.combatEnabled);
	}
}
