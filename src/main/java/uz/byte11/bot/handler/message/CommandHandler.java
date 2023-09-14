package uz.byte11.bot.handler.message;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import uz.byte11.bot.handler.Command;
import uz.byte11.bot.state.HomeState;

public class CommandHandler {

    public static void handleCommand(Message message, TelegramLongPollingBot bot) {
        switch (Command.of(message.getText())){
            case COMMAND_START -> handleCommandStart(message,bot);
            case COMMAND_HELP -> handleCommandHelp(message, bot);
            case COMMAND_SETTINGS -> handleCommandSettings(message, bot);
        }
    }

    private static void handleCommandSettings(Message message, TelegramLongPollingBot bot) {

    }

    private static void handleCommandHelp(Message message, TelegramLongPollingBot bot) {

    }


    private static void handleCommandStart(Message message, TelegramLongPollingBot bot){
        try {
            bot.execute(SendMessage.builder()
                    .chatId(message.getChatId())
                    .text("Welcome Choose one of the Skin Color")
                    .replyMarkup(HomeState.INLINE_MARKUP_HOME_STATE)
                    .build()
            );
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

}
