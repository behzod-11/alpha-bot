package uz.byte11.bot.handler.message;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import uz.byte11.bot.processor.RegistrationProcessor;
import uz.byte11.bot.state.State;
import uz.byte11.bot.state.UserStateRepo;

public class MessagePhotoHandler {
    public static void handleMessagePhoto(Message message, TelegramLongPollingBot bot) {
        switch (UserStateRepo.USER_STATES.get(message.getChatId())) {
            case REGISTER_STATE_PHOTO -> handleRegisterPhoto(message, bot);
        }
    }

    private static void handleRegisterPhoto(Message message, TelegramLongPollingBot bot) {
//        Image saved
        UserStateRepo.USER_STATES.put(message.getChatId(), State.REGISTER_STATE_USERNAME);
    }
}
