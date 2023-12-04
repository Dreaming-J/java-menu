package menu.model;

import static menu.message.ErrorMsg.TEAM_NUMBER_ERROR;
import static menu.util.Constant.COMMA;

import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Team {

    private static final String REGEX = "^[가-힣]+(,[가-힣]+){1,4}$";
    private final List<Coach> coaches;

    public Team(String coaches) {
        validate(coaches);
        this.coaches = Stream.of(coaches.split(COMMA))
                .map(Coach::new)
                .toList();
        validate();
    }

    private void validate(String coaches) {
        if (!Pattern.matches(REGEX, coaches)) {
            throw new IllegalArgumentException(TEAM_NUMBER_ERROR.toString());
        }
    }

    private void validate() {
        if (coaches.size() != Set.copyOf(coaches).size()) {
            throw new IllegalArgumentException(TEAM_NUMBER_ERROR.toString());
        }
    }
}
