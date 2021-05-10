package me.MartHus.BeesCombat;

import org.bukkit.plugin.java.JavaPlugin;

import me.MartHus.BeesCombat.Listener.BlockPlace;
import me.MartHus.BeesCombat.Listener.PlayerRespawn;


public class Main extends JavaPlugin
{
	
	// Boolean that is for if the player will get items or not
	public static boolean combatEnabled;
	
	Items items = new Items();
	
	@Override
	public void onEnable()
	{
		// startup
		// reloads
		// plugin reloads
		
		System.out.println("[Bees Combat] Starting Bees Comabt Plugin!");
		combatEnabled = false;
		
		items.init();
		new CommandManager();
		
		this.getServer().getPluginManager().registerEvents(new PlayerRespawn(), this);
		this.getServer().getPluginManager().registerEvents(new BlockPlace(), this);
	}
	
	@Override
	public void onDisable()
	{
		// shutdown
		// reloads
		// plugin reloads
		
		System.out.println("[Bees Combat] Stopping Bees Combat Plugin!");
		combatEnabled = false;
	}
}
