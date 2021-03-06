package com.valkessentials.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly extends Cmd {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		super.onCommand(sender, command, label, args);
		if (!cmd("fly", "essentials.fly", 0)) return false;
		
		Player p = Bukkit.getPlayer(sender.getName());
		
		if (p.isFlying()) {
			p.setFlying(false);
		} else {
			p.setFlying(true);
		}
		return true;
	}

}
