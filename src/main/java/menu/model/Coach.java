package menu.model;

import static menu.message.ErrorMsg.COACH_NAME_ERROR;
import static menu.message.ErrorMsg.HATE_FOOD_ERROR;
import static menu.util.Constant.COMMA;
import static menu.util.Constant.HATE_FOOD_REGEX;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Coach {

    private static final int MIN_INCLUSIVE_OF_NAME = 2;
    private static final int MAX_INCLUSIVE_OF_NAME = 4;
    private static final int MAX_INCLUSIVE_OF_HATE_FOOD = 2;
    private static final int DUPLICATED_NUMBER = 1;
    private final String name;
    private List<Food> hateFood;

    public Coach(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name.length() < MIN_INCLUSIVE_OF_NAME || name.length() > MAX_INCLUSIVE_OF_NAME) {
            throw new IllegalArgumentException(COACH_NAME_ERROR.toString());
        }
    }

    public void setHateFood(String hateFood) {
        if (hateFood.isEmpty()) {
            this.hateFood = new ArrayList<>();
            return;
        }

        validateHateFood(hateFood);
        this.hateFood = Stream.of(hateFood.split(COMMA))
                .map(Food::new)
                .toList();
        validateHateFood(this.hateFood);
    }

    private void validateHateFood(String hateFood) {
        if (!Pattern.matches(HATE_FOOD_REGEX, hateFood)) {
            throw new IllegalArgumentException(HATE_FOOD_ERROR.toString());
        }
    }

    private void validateHateFood(List<Food> hateFood) {
        if (hateFood.size() == MAX_INCLUSIVE_OF_HATE_FOOD & Set.copyOf(hateFood).size() == DUPLICATED_NUMBER) {
            throw new IllegalArgumentException(HATE_FOOD_ERROR.toString());
        }
    }
}
