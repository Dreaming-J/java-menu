package menu.model;

import org.junit.jupiter.api.Test;

public class LunchLotteryTest {

    @Test
    void 카테고리_추천_확인() {
        LunchLottery lunchLottery = new LunchLottery();
        int maxRecommendedCategory = Category.values().length * 2;
        // 1을 더하면: 무한루프
        // 1을 안더하면: 정상종료
        for (int i = 0; i < maxRecommendedCategory + 1; i++) {
            lunchLottery.drawCategory();
        }
    }
}
