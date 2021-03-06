package itemslimitations.stiven;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import java.io.File;

public class Main extends JavaPlugin {

    private static Main plugin;
    public static Main getMain() { return plugin; }

    public void onEnable() {
        plugin = this;
        int pluginId = 9707;
        Metrics metrics = new Metrics(this, pluginId);
        getCommand("itemslimitations").setExecutor(new Commands());
        Bukkit.getPluginManager().registerEvents(new Events(), this);
        checkConfig();
    }

    public void checkConfig() {
        File config = new File(getDataFolder() + File.pathSeparator + "config.yml");
        if (config.exists()) {
            saveConfig();
        } else {
            saveDefaultConfig();
        }
        reloadConfig();
    }

}
