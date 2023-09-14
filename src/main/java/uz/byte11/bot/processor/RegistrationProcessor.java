package uz.byte11.bot.processor;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import uz.byte11.bot.state.State;
import uz.byte11.bot.state.UserStateRepo;
import uz.byte11.bot.util.ReplyMarkupUtils;

public class RegistrationProcessor {
    public static void processRegistrationPhoto(Long chatId, TelegramLongPollingBot bot) {
        try {
            bot.execute(SendMessage.builder().text("Please send your photo").chatId(chatId).build());
            UserStateRepo.USER_STATES.put(chatId, State.REGISTER_STATE_PHOTO);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public static void processRegistrationUsername(Long chatId, TelegramLongPollingBot bot) {
        try {
            bot.execute(SendMessage.builder().text("Enter your username : ").chatId(chatId).build());
            UserStateRepo.USER_STATES.put(chatId, State.REGISTER_STATE_USERNAME);
            RegistrationProcessor.processRegistrationContact(chatId, bot);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    public static void processRegistrationContact(Long chatId, TelegramLongPollingBot bot) {
        try {
            bot.execute(SendMessage.builder()
                    .text("Share you contact")
                    .chatId(chatId)
                    .replyMarkup(ReplyMarkupUtils.REPLY_MARKUP_SHARE_CONTACT)
                    .build());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
