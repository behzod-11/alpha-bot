package uz.byte11.bot.state;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.List;

public class HomeState {

    public static final InlineKeyboardMarkup INLINE_MARKUP_HOME_STATE = InlineKeyboardMarkup
            .builder()
            .keyboardRow(List.of(
                    InlineKeyboardButton.builder().callbackData("register").text("\uD83D\uDCDD Registration").build(),
                    InlineKeyboardButton.builder().callbackData("black").text("\uD83E\uDDD4\uD83C\uDFFF Black").build(),
                    InlineKeyboardButton.builder().callbackData("brown").text("\uD83E\uDDD4\uD83C\uDFFB\u200D♂\uFE0F Brown").build()
            )).build();

}
