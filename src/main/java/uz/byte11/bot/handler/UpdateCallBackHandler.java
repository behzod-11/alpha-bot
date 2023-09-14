package uz.byte11.bot.handler;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import uz.byte11.bot.processor.RegistrationProcessor;

public class UpdateCallBackHandler {
    public static void handleUpdateCallBackQuery(CallbackQuery callbackQuery, TelegramLongPollingBot bot) {
        switch (callbackQuery.getData()){
            case "register" -> RegistrationProcessor.processRegistrationPhoto(callbackQuery, bot);
        }
    }
}
