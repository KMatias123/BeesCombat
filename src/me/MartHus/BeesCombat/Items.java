package me.MartHus.BeesCombat;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Items {

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
	
	Main main = new Main();
	
	public void giveItems(Player player)
	{
		player.getInventory().addItem(IronSword);
		player.getInventory().addItem(Bow);
		player.getInventory().addItem(Stick);
		player.getInventory().addItem(IronPickaxe);
		for (int i = 0; i < 16; i++)
			player.getInventory().addItem(StoneBlock);
		player.getInventory().addItem(Arrow);
	}
	
	public void init() {

		// Iron Sword Meta
		SwordMeta.isUnbreakable();
		SwordMeta.addEnchant(Enchantment.DAMAGE_ALL,        4,      true);
		SwordMeta.addEnchant(Enchantment.VANISHING_CURSE,   1,      true);
		IronSword.setItemMeta(SwordMeta);
		
		// Bow Meta
		BowMeta.isUnbreakable();
		BowMeta.addEnchant(Enchantment.ARROW_DAMAGE,        5,      true);
		BowMeta.addEnchant(Enchantment.VANISHING_CURSE,     1,      true);
		BowMeta.addEnchant(Enchantment.ARROW_INFINITE,      1,      true);
		Bow.setItemMeta(BowMeta);
		
		// Stick Meta
		StickMeta.isUnbreakable();
		StickMeta.addEnchant(Enchantment.KNOCKBACK,         5,      true);
		StickMeta.addEnchant(Enchantment.VANISHING_CURSE,   1,      true);
		Stick.setItemMeta(StickMeta);
		
		// Iron Pickaxe Meta
		PickaxeMeta.isUnbreakable();
		PickaxeMeta.addEnchant(Enchantment.DIG_SPEED,       696969, true);
		PickaxeMeta.addEnchant(Enchantment.VANISHING_CURSE, 1,      true);
		IronPickaxe.setItemMeta(PickaxeMeta);
		
		// Stone Block
		StoneMeta.addEnchant(Enchantment.VANISHING_CURSE,   1,      true);
		StoneBlock.setItemMeta(StoneMeta);
		
		// Arrow
		ArrowMeta.addEnchant(Enchantment.VANISHING_CURSE,   1,      true);
		Arrow.setItemMeta(ArrowMeta);
	}
}
