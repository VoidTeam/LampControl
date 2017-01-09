package cz.ceph.lampcontrol.localization;

import cz.ceph.lampcontrol.LampControl;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.HashMap;
import java.util.Set;

public class Localizations {

    private LampControl plugin;

    private HashMap<String, YamlConfiguration> langFiles;

    public Localizations(LampControl plugin) {
        this.plugin = plugin;
        langFiles = new HashMap<>();
    }

    public void findAndLoadFiles() {
        try {
            for (File file : plugin.getDataFolder().listFiles()) {
                if (file.getName().startsWith("lang.")) {
                    String[] parts = file.getName().split("\\.");
                    langFiles.put(parts[1], YamlConfiguration.loadConfiguration(file));
                }
            }
        } catch (NullPointerException e) {
            plugin.getLogger().warning("There was an error during loading of languages!");
        }
    }

    public Set<String> getAvailableLanguages() {
        return langFiles.keySet();
    }

    public String get(String lang, String key) {
        return get(lang, key, "{d" + lang + ":" + key + "}");
    }

    public String get(String lang, String key, String fallback) {
        YamlConfiguration language = langFiles.get(lang);
        if (language == null) return fallback;

        return language.getString(key, fallback);
    }
}
