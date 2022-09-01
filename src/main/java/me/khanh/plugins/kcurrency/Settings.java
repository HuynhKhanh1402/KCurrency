package me.khanh.plugins.kcurrency;

import lombok.Getter;
import org.bukkit.configuration.file.FileConfiguration;
import org.jetbrains.annotations.NotNull;

public class Settings {
    @Getter
    private final KCurrencyPlugin plugin;
    @Getter
    private final FileConfiguration config;

    @NotNull
    public final String GENERAL_LANGUAGE;

    public Settings(KCurrencyPlugin plugin){
        this.plugin = plugin;
        this.config = plugin.getConfig();

        GENERAL_LANGUAGE = config.getString("General.Language", "en_US");
    }
}
