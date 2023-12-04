package menu.model;

import java.util.ArrayList;
import java.util.List;
import menu.util.StringGenerator;

public class LunchLottery {

    private static final int MAX_CATEGORY_COUNT = 2;
    private static final String PREFIX_NAME = "카테고리";
    private final List<Category> recommendedCategory;

    public LunchLottery() {
        this.recommendedCategory = new ArrayList<>();
    }

    public void drawFood(Category category, Coach coach) {
        while (true) {
            Food food = Menu.fromRandom(category);
            if (coach.setDiet(food)) {
                return;
            }
        }
    }

    public Category drawCategory() {
        while (true) {
            Category category = Category.fromRandom();
            if (canRecommendCategory(category)) {
                recommendedCategory.add(category);
                return category;
            }
        }
    }

    private boolean canRecommendCategory(Category category) {
        return recommendedCategory.stream()
                .filter(x -> x.equals(category))
                .count() < MAX_CATEGORY_COUNT;
    }

    @Override
    public String toString() {
        return StringGenerator.generate(PREFIX_NAME, recommendedCategory);
    }
}
