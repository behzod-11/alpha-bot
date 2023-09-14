package uz.byte11.bot.state;

import java.util.HashMap;
import java.util.Map;

public interface UserStateRepo {
    Map<Long, State> USER_STATES = new HashMap<>();
}
