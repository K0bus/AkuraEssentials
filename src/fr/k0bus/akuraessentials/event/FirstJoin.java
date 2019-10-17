package fr.k0bus.akuraessentials.event;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.k0bus.akuraessentials.Main;

public class FirstJoin implements Listener{
	@EventHandler(ignoreCancelled = true)
    public void onJoin(PlayerJoinEvent e)
    {
		if(!e.getPlayer().hasPlayedBefore())
		{
			Main.plugin.getServer().broadcastMessage(Main.tag + ChatColor.LIGHT_PURPLE + "Souhaitez la bienvenue à " + ChatColor.GREEN + e.getPlayer().getDisplayName() + ChatColor.LIGHT_PURPLE + " !");
		}
    }
}
