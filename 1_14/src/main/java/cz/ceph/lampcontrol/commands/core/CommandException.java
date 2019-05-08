package cz.ceph.lampcontrol.commands.core;

/**
 * Created by SiOnzee on 10.01.2017.
 */

public class CommandException extends Exception {
    private static final long serialVersionUID = -8469200816781637106L;

    public CommandException(String message) {
        super(message);
    }
}
