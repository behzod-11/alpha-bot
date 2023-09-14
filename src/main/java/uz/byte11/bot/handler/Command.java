package uz.byte11.bot.handler;

import uz.byte11.bot.exception.UnsupportedCommandException;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Command {
    COMMAND_START("/start"),
    COMMAND_HELP("/help"),
    COMMAND_SETTINGS("/setting");

    private static final Map<String, Command> commands = Arrays.stream(Command.values())
            .collect(Collectors.toMap(command -> command.value, command -> command));

    public final String value;

    Command(String value) {
        this.value = value;
    }

    public static Command of(final String command) {
        Command c = commands.get(command);
        if (c != null) {
            return c;
        }
        throw UnsupportedCommandException.of(command);
    }
}
