package uz.byte11.bot.handler.message;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import uz.byte11.bot.processor.RegistrationProcessor;
import uz.byte11.bot.state.UserStateRepo;

public class MessageTextHandler {
    public static void handleMessageText(Message message, TelegramLongPollingBot bot) {
        if (message.isCommand()) {
            CommandHandler.handleCommand(message, bot);
        } else {
            switch (UserStateRepo.USER_STATES.get(message.getChatId())) {
                case REGISTER_STATE_USERNAME -> handleRegistrationUsername(message, bot);
                case REGISTER_STATE_CONTACT -> handleRegistrationContact(message, bot);
            }
        }
    }

    public static void handleRegistrationUsername(Message message, TelegramLongPollingBot bot) {
//        TODO - make logic
        RegistrationProcessor.processRegistrationContact(message.getChatId(), bot);
    }

    public static void handleRegistrationContact(Message message, TelegramLongPollingBot bot) {
//       TODO - make logic
        RegistrationProcessor.processRegistrationContact(message.getChatId(), bot);
    }
}
