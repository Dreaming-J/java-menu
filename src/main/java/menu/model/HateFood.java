package menu.model;

import static menu.message.ErrorMsg.HATE_FOOD_ERROR;
import static menu.util.Constant.COMMA;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class HateFood {

    private static final String REGEX = "^[가-힣]+(,[가-힣]+)?$";
    private final List<Food> hateFood;

    public HateFood(String hateFood) {
        this.hateFood = createHateFood(hateFood);
        validateHateFood(this.hateFood);
    }

    public boolean hasFood(Food food) {
        return hateFood.contains(food);
    }

    private List<Food> createHateFood(String hateFood) {
        if (hateFood.isEmpty()) {
            return new ArrayList<>();
        }

        validateHateFood(hateFood);
        return Stream.of(hateFood.split(COMMA))
                .map(Food::new)
                .toList();
    }

    private void validateHateFood(String hateFood) {
        if (!Pattern.matches(REGEX, hateFood)) {
            throw new IllegalArgumentException(HATE_FOOD_ERROR.toString());
        }
    }

    private void validateHateFood(List<Food> hateFood) {
        if (hateFood.size() != Set.copyOf(hateFood).size()) {
            throw new IllegalArgumentException(HATE_FOOD_ERROR.toString());
        }
    }
}
