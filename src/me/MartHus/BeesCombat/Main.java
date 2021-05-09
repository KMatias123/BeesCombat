package me.MartHus.BeesCombat;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import me.MartHus.BeesCombat.Commands.StartCombatCommand;
import me.MartHus.BeesCombat.Commands.StopCombatCommand;
import me.MartHus.BeesCombat.Listener.BlockPlace;
import me.MartHus.BeesCombat.Listener.PlayerRespawn;


public class Main extends JavaPlugin
{
	
	// Boolean that is for if the player will get items or not
	public static boolean combatEnabled;
	
	// Iron Sword
	public static ItemStack IronSword = new ItemStack(Material.IRON_SWORD);
	public static ItemMeta SwordMeta = IronSword.getItemMeta();
	
	// Bow
	public static ItemStack Bow = new ItemStack(Material.BOW);
	public static ItemMeta BowMeta = Bow.getItemMeta();
	
	// Stick
	public static ItemStack Stick = new ItemStack(Material.STICK);
	public static ItemMeta StickMeta = Stick.getItemMeta();
	
	// Iron pickaxe
	public static ItemStack IronPickaxe = new ItemStack(Material.IRON_PICKAXE);
	public static ItemMeta PickaxeMeta = IronPickaxe.getItemMeta();
	
	// Stone Block
	public static ItemStack StoneBlock = new ItemStack(Material.STONE);
	public static ItemMeta StoneMeta = StoneBlock.getItemMeta();
	
	// Arrow
	public static ItemStack Arrow = new ItemStack(Material.ARROW);
	public static ItemMeta ArrowMeta = Arrow.getItemMeta();
	
	Items items = new Items();
	
	@Override
	public void onEnable()
	{
		// startup
		// reloads
		// plugin reloads
		
		System.out.println("[Bees Combat] Starting Bees Comabt Plugin!");
		combatEnabled = false;
		
		items.setMeta();
		
		this.getServer().getPluginManager().registerEvents(new PlayerRespawn(), this);
		this.getServer().getPluginManager().registerEvents(new BlockPlace(), this);
		
		this.getCommand("startCombat").setExecutor(new StartCombatCommand());
		this.getCommand("stopCombat").setExecutor(new StopCombatCommand());
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
