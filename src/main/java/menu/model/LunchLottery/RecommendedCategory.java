package menu.model.LunchLottery;

import java.util.ArrayList;
import java.util.List;
import menu.model.Category;
import menu.util.StringGenerator;

public class RecommendedCategory {

    private static final int MAX_CATEGORY_COUNT = 2;
    private static final String PREFIX_NAME = "카테고리";
    private final List<Category> recommendedCategory;

    public RecommendedCategory() {
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

    @Override
    public String toString() {
        return StringGenerator.generate(PREFIX_NAME, recommendedCategory);
    }
}
