package me.khanh.plugins.kcurrency;

import lombok.Getter;
import me.khanh.plugins.kcurrency.commands.MainCommand;
import org.bukkit.plugin.java.JavaPlugin;
import revxrsal.commands.bukkit.BukkitCommandHandler;
import revxrsal.commands.bukkit.core.BukkitHandler;



public final class KCurrencyPlugin extends JavaPlugin {
    @Getter
    private BukkitCommandHandler commandHandler;
    @Getter
    private Settings settings;
    @Getter
    private Language language;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        settings = new Settings(this);


        language = new Language(this, settings.GENERAL_LANGUAGE);

        commandHandler = new BukkitHandler(this);
        commandHandler.setLocale(language.getLocale());
        commandHandler.getTranslator().add(language);
        commandHandler.register(new MainCommand(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
