package uz.byte11.bot.handler;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import uz.byte11.bot.handler.message.MessagePhotoHandler;
import uz.byte11.bot.handler.message.MessageTextHandler;

public class UpdateMessageHandler {
    public static void handleUpdateMessage(Message message, TelegramLongPollingBot bot) {
        if (message.hasText()){
            MessageTextHandler.handleMessageText(message, bot);
        }else if (message.hasPhoto()){
            MessagePhotoHandler.handleMessagePhoto(message, bot);
        }
    }
}
