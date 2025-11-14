package itemslimitations.stiven;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import java.io.File;

public class Main extends JavaPlugin {

    private static Main plugin;
    public static Main getMain() {
        return plugin;
    }

    public void onEnable() {
        plugin = this;

        getCommand("itemslimitations").setExecutor(new Commands());
        Bukkit.getPluginManager().registerEvents(new Events(), this);
        reload();
    }

    public void reload() {
        reloadConfig();


    }

}
