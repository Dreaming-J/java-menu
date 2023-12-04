package menu.model;

import static menu.message.ErrorMsg.SELECT_CATEGORY_ERROR;

import java.util.stream.Stream;

public enum Category {
    JAPANESE(1),
    KOREAN(2),
    CHINESE(3),
    ASIAN(4),
    WESTERN(5);

    private final int number;

    Category(int number) {
        this.number = number;
    }

    public static Category get(int number) {
        return Stream.of(values())
                .filter(category -> category.number == number)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(SELECT_CATEGORY_ERROR.toString()));
    }
}
