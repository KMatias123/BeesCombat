package me.MartHus.BeesCombat.Listener;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import me.MartHus.BeesCombat.Main;

public class BlockPlace implements Listener {

	@EventHandler
	public void blockPlace (BlockPlaceEvent event)
	{
		Block block = event.getBlock();
		Material material = block.getType();
		Player player = event.getPlayer();

		player.sendMessage("Block placed");
		
		if (material.equals(Material.STONE))
		{
			player.sendMessage("Stone placed");
			player.getInventory().addItem(Main.StoneBlock);
		}
		else
		{
			player.sendMessage("Something else than stone was placed");
		}
	}
	
}
