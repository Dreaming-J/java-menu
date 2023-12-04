package menu.model;

import static menu.message.ErrorMsg.HATE_FOOD_ERROR;
import static menu.util.Constant.COMMA;
import static menu.util.Constant.HATE_FOOD_REGEX;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class HateFood {

    private static final int MAX_INCLUSIVE = 2;
    private static final int DUPLICATED_NUMBER = 1;
    private final List<Food> hateFood;

    public HateFood(String hateFood) {
        this.hateFood = setHateFood(hateFood);
        validateHateFood(this.hateFood);
    }

    public boolean hasFood(Food food) {
        return hateFood.contains(food);
    }

    private List<Food> setHateFood(String hateFood) {
        if (hateFood.isEmpty()) {
            return new ArrayList<>();
        }

        validateHateFood(hateFood);
        return Stream.of(hateFood.split(COMMA))
                .map(Food::new)
                .toList();
    }

    private void validateHateFood(String hateFood) {
        if (!Pattern.matches(HATE_FOOD_REGEX, hateFood)) {
            throw new IllegalArgumentException(HATE_FOOD_ERROR.toString());
        }
    }

    private void validateHateFood(List<Food> hateFood) {
        if (hateFood.size() == MAX_INCLUSIVE & Set.copyOf(hateFood).size() == DUPLICATED_NUMBER) {
            throw new IllegalArgumentException(HATE_FOOD_ERROR.toString());
        }
    }
}
