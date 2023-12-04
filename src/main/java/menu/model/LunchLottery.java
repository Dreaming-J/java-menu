package menu.model;

import java.util.ArrayList;
import java.util.List;

public class LunchLottery {

    private static final int MAX_CATEGORY_COUNT = 2;
    private final List<Category> recommendedCategory;

    public LunchLottery() {
        this.recommendedCategory = new ArrayList<>();
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
}