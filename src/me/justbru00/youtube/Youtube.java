package me.justbru00.youtube;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Youtube extends JavaPlugin {
	
	Logger logger = Logger.getLogger("Minecraft");

	@Override
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
		Player player = (Player) sender;
		
		if (commandLabel.equalsIgnoreCase("hello")) {
			player.sendMessage(ChatColor.GOLD + "Hello, " + ChatColor.AQUA + player.getName());			
		}
		
		
		return false;
	}

	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Has Been Disabled.");
	}

	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " version: "
				+ pdfFile.getVersion() + " Has Been Enabled.");		
	}
	
	

}
