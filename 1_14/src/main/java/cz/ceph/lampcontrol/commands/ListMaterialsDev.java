package cz.ceph.lampcontrol.commands;

import cz.ceph.lampcontrol.commands.core.IBasicCommand;
import cz.ceph.lampcontrol.commands.core.RegisterCommand;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

/**
 * Created by iamceph on 05.10.2018.
 */

@RegisterCommand(value = "lcgetmaterials")
public class ListMaterialsDev implements IBasicCommand {

    @Override
    public String getPermission() {
        return "lampcontrol.command.lcgetmaterials";
    }

    @Override
    public String getDescription() {
        return "Developement tool to get materials in config list";
    }

    @Override
    public String getUsage() {
        return "/lcgetmaterials";
    }

    @Override
    public boolean onPlayerCommand(Player player, String[] args) {
        return false;
    }

    @Override
    public boolean onConsoleCommand(ConsoleCommandSender sender, String[] args) {
        return false;
    }
}
