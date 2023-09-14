package uz.byte11.bot.exception;

public class UnsupportedCommandException extends RuntimeException {
    public UnsupportedCommandException(String message) {
        super(message);
    }

    public static UnsupportedCommandException of(String command) {
        return new UnsupportedCommandException("Unsupported command - " + command);
    }
}
