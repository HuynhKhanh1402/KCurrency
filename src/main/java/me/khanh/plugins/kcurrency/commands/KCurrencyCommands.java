package me.khanh.plugins.kcurrency.commands;

import lombok.Getter;
import me.khanh.plugins.kcurrency.KCurrencyPlugin;
import me.khanh.plugins.kcurrency.utils.LoggerUtils;
import org.bukkit.command.CommandSender;
import revxrsal.commands.annotation.Command;
import revxrsal.commands.annotation.Subcommand;

@Command({"KCurrency", "kc"})
@SuppressWarnings("unused")
public class KCurrencyCommands {
    @Getter
    private final KCurrencyPlugin plugin;

    public KCurrencyCommands(KCurrencyPlugin plugin){
        this.plugin = plugin;
    }


    @Subcommand("test")
    public void test(CommandSender sender, String param1, String param2){
        LoggerUtils.info(param1 + param2);
    }
}
