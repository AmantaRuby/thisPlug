package me.amantaruby.main;

import me.amantaruby.main.ACFly.ACFly;
import me.amantaruby.main.CustomItems.CustomItems;
import me.amantaruby.main.Events.EventsClass;
import me.amantaruby.main.commands.FlyCommands;
import me.amantaruby.main.regen.regenClass;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.BLUE + "---LearnSpigot Plugin Has" + ChatColor.GREEN + " Enabled" + ChatColor.BLUE + "---");
        getServer().getPluginManager().registerEvents(new EventsClass(), this);
        getServer().getPluginManager().registerEvents(new ACFly(), this);
        getServer().getPluginManager().registerEvents(new CustomItems(), this);
        new FlyCommands(this);
        new regenClass(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.BLUE + "---LearnSpigot Plugin Was" + ChatColor.RED + " DISABLED" + ChatColor.BLUE + "---");

    }


}



















