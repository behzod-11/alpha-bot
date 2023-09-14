package uz.byte11.bot.util;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.List;

public class ReplyMarkupUtils {
    public static final ReplyKeyboardMarkup REPLY_MARKUP_SHARE_CONTACT = ReplyKeyboardMarkup.builder()
            .keyboardRow(new KeyboardRow(List.of(KeyboardButton.builder().text("Share Contact").requestContact(true).build())))
            .build();
}
