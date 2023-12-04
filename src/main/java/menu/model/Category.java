package menu.model;

import static menu.message.ErrorMsg.SELECT_CATEGORY_ERROR;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.stream.Stream;

public enum Category {
    JAPANESE(1),
    KOREAN(2),
    CHINESE(3),
    ASIAN(4),
    WESTERN(5);

    private static final int START_INCLUSIVE = 1;
    private static final int END_INCLUSIVE = 5;
    private final int number;

    Category(int number) {
        this.number = number;
    }

    public static Category from(int number) {
        return Stream.of(values())
                .filter(category -> category.number == number)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(SELECT_CATEGORY_ERROR.toString()));
    }

    public static Category fromRandom() {
        return from(Randoms.pickNumberInRange(START_INCLUSIVE, END_INCLUSIVE));
    }
}
