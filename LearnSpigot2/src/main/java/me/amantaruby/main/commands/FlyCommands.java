package me.amantaruby.main.commands;

import me.amantaruby.main.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommands implements CommandExecutor {

    private Main plugin;

    public FlyCommands(Main plugin){
        this.plugin = plugin;

        plugin.getCommand("fly").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(label.equalsIgnoreCase("fly")){
            if(!(sender instanceof Player)){
                sender.sendMessage("Lol, console want fly ?");
                return true;
            }
            Player p = (Player) sender;

            if(args.length == 0) {
                if(p.getAllowFlight() == (true)){
                    p.setAllowFlight(false);
                    p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "LUCKYESSENTIALS " + ChatColor.RED + "" + ChatColor.BOLD + "/ You can no longer fly!");
                    return true;
                }

                if(p.getAllowFlight() == (false)){
                    p.setAllowFlight(true);
                    p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "LUCKYESSENTIALS " + ChatColor.GREEN + "" + ChatColor.BOLD + "/ You can now fly!");
                    return true;
                }
                return true;
            }
        }
        return false;
    }
}
















