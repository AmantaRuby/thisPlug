package me.amantaruby.main.Events;

import com.google.gson.internal.bind.ObjectTypeAdapter;
import jdk.internal.org.jline.utils.Display;
import me.amantaruby.main.CustomItems.CustomItems;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
//import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scoreboard.*;

import javax.sql.rowset.JoinRowSet;
import java.util.ArrayList;

public class EventsClass implements Listener {

    private CustomItems ci = new CustomItems();

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player p = event.getPlayer();
        event.setJoinMessage(ChatColor.GREEN + "Hi " + ChatColor.GOLD + p.getName() + ChatColor.GREEN + " ||| WELCOME TO LUCKYNETWORK REMAKE SERVER |||");

        ScoreboardManager m = Bukkit.getScoreboardManager();
        Scoreboard b = m.getNewScoreboard();

        p.setGameMode(GameMode.CREATIVE);

        Objective o = b.registerNewObjective("Gold","");
        o.setDisplaySlot(DisplaySlot.SIDEBAR);
        o.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "HUB");

        Score server = o.getScore(ChatColor.GOLD + "" + ChatColor.BOLD + "Server");
        server.setScore(9);

        Score ServerStatsCurrentHub = o.getScore("   Current: " + ChatColor.GREEN + "Hub-1");
        ServerStatsCurrentHub.setScore(8);

        Score ServerStatsOnlinePlayer = o.getScore("   Online: " + ChatColor.GREEN + "10");
        ServerStatsOnlinePlayer.setScore(7);

        Score IgnoreScore = o.getScore("" + ChatColor.GREEN + "");
        IgnoreScore.setScore(6);

        Score ServerStatsPlayerName = o.getScore(ChatColor.GOLD + "" + ChatColor.BOLD + p.getName());
        ServerStatsPlayerName.setScore(5);

//        Score ServerStatsPlayerRank = o.getScore("   Rank: " + ChatColor.AQUA + "[MVP" + ChatColor.RED + "+" + ChatColor.AQUA + "]");
//        ServerStatsPlayerRank.setScore(4);

        Score ServerStatsPlayerRank = o.getScore("   Rank: " + ChatColor.GOLD + "" + ChatColor.BOLD + "[" + ChatColor.YELLOW + "" + ChatColor.BOLD + "LUCKY" + ChatColor.GOLD + "" + ChatColor.BOLD + "]");
        ServerStatsPlayerRank.setScore(4);

        Score ServerStatsLuckyCoins = o.getScore("   LuckyCoins: " + ChatColor.YELLOW + "25989");
        ServerStatsLuckyCoins.setScore(3);

        Score IgnoreScore2 = o.getScore("");
        IgnoreScore2.setScore(2);

        Score NameServer = o.getScore(ChatColor.YELLOW + "luckynetwork.net");
        NameServer.setScore(1);

        ItemStack item = new ItemStack(Material.COMPASS);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Server Selector");
        ArrayList<String> lore = new ArrayList<String>();
//        lore.add(ChatColor.GRAY + "" + ChatColor.BOLD + "Select Minigames");
//        meta.setLore(lore);
        item.setItemMeta(meta);

        ItemStack itemBeacon = new ItemStack(Material.BEACON);
        ItemMeta metaBeacon = itemBeacon.getItemMeta();
        metaBeacon.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Hub Selector");
        itemBeacon.setItemMeta(metaBeacon);

        ItemStack itemCosmetic = new ItemStack(Material.NETHER_STAR);
        ItemMeta metaCosmetic = itemCosmetic.getItemMeta();
        metaCosmetic.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Cosmetics");
        itemCosmetic.setItemMeta(metaCosmetic);

        ItemStack itemDonate = new ItemStack(Material.EMERALD);
        ItemMeta metaDonate = itemDonate.getItemMeta();
        metaDonate.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Donator Perks");
        itemDonate.setItemMeta(metaDonate);

        ItemStack itemOptions = new ItemStack(Material.ANVIL);
        ItemMeta metaOptions = itemOptions.getItemMeta();
        metaOptions.setDisplayName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Options");
        itemOptions.setItemMeta(metaOptions);


        p.getInventory().setItem(0,item);
        p.getInventory().setItem(1,itemBeacon);
        p.getInventory().setItem(3,itemCosmetic);
        p.getInventory().setItem(5,itemDonate);
        p.getInventory().setItem(7,itemOptions);

//        ci.giveItems(p);

        p.setScoreboard(b);

        //need 16msg
        p.sendMessage();
        p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "            ACCOUNT AUTHENTICATION");

    }

}
