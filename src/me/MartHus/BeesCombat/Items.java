package me.MartHus.BeesCombat;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

public class Items {

	Main main = new Main();
	
	public void giveItems(Player player)
	{
		player.getInventory().addItem(Main.IronSword);
		player.getInventory().addItem(Main.Bow);
		player.getInventory().addItem(Main.Stick);
		player.getInventory().addItem(Main.IronPickaxe);
		for (int i = 0; i < 16; i++)
			player.getInventory().addItem(Main.StoneBlock);
		player.getInventory().addItem(Main.Arrow);
	}
	
	public void setMeta() {

		// Iron Sword Meta
		Main.SwordMeta.isUnbreakable();
		Main.SwordMeta.addEnchant(Enchantment.DAMAGE_ALL,      4, true);
		Main.SwordMeta.addEnchant(Enchantment.VANISHING_CURSE, 1, true);
		Main.IronSword.setItemMeta(Main.SwordMeta);
		
		// Bow Meta
		Main.BowMeta.isUnbreakable();
		Main.BowMeta.addEnchant(Enchantment.ARROW_DAMAGE,    5, true);
		Main.BowMeta.addEnchant(Enchantment.VANISHING_CURSE, 1, true);
		Main.BowMeta.addEnchant(Enchantment.ARROW_INFINITE,  1, true);
		Main.Bow.setItemMeta(Main.BowMeta);
		
		// Stick Meta
		Main.StickMeta.isUnbreakable();
		Main.StickMeta.addEnchant(Enchantment.KNOCKBACK,       5, true);
		Main.StickMeta.addEnchant(Enchantment.VANISHING_CURSE, 1, true);
		Main.Stick.setItemMeta(Main.StickMeta);
		
		// Iron Pickaxe Meta
		Main.PickaxeMeta.isUnbreakable();
		Main.PickaxeMeta.addEnchant(Enchantment.DIG_SPEED,       696969, true);
		Main.PickaxeMeta.addEnchant(Enchantment.VANISHING_CURSE, 1,      true);
		Main.IronPickaxe.setItemMeta(Main.PickaxeMeta);
		
		// Stone Block
		Main.StoneMeta.addEnchant(Enchantment.VANISHING_CURSE, 1, true);
		Main.StoneBlock.setItemMeta(Main.StoneMeta);
		
		// Arrow
		Main.ArrowMeta.addEnchant(Enchantment.VANISHING_CURSE, 1, true);
		Main.Arrow.setItemMeta(Main.ArrowMeta);
	}
}
