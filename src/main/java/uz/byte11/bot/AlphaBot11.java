package uz.byte11.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import uz.byte11.bot.handler.UpdateCallBackHandler;
import uz.byte11.bot.handler.UpdateMessageHandler;

public class AlphaBot11 extends TelegramLongPollingBot {

    public AlphaBot11() {
        super("6195480897:AAHVNDeU1hmg7T1Fhg-85AzYEj4eJ0OZiew");
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            UpdateMessageHandler.handleUpdateMessage(update.getMessage(), this);
        }else if (update.hasCallbackQuery()){
            UpdateCallBackHandler.handleUpdateCallBackQuery(update.getCallbackQuery(), this);
        }
    }

    @Override
    public String getBotUsername() {
        return "@ex_alpha_bot";
    }
}
