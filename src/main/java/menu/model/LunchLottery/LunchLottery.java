package menu.model.LunchLottery;

import menu.model.Category;
import menu.model.Coach;
import menu.model.Food;
import menu.model.Menu;

public class LunchLottery {

    private final RecommendedCategory recommendedCategory;

    public LunchLottery() {
        this.recommendedCategory = new RecommendedCategory();
    }

    public void drawFood(Coach coach) {
        Category category = recommendedCategory.drawCategory();

        while (true) {
            Food food = Menu.fromRandom(category);
            if (coach.setDiet(food)) {
                return;
            }
        }
    }
}
