package me.khanh.plugins.kcurrency.utils;

import me.khanh.plugins.kcurrency.KCurrencyPlugin;

public class LoggerUtils {
    private static final KCurrencyPlugin plugin = KCurrencyPlugin.getPlugin(KCurrencyPlugin.class);

    public static void info(String message){
        plugin.getLogger().info(StringUtils.color(message));
    }

    public static void warning(String message){
        plugin.getLogger().warning(message);
    }

    public static void severe(String message){
        plugin.getLogger().severe(message);
    }
}
