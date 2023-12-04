package menu.model;

import static menu.message.ErrorMsg.SELECT_CATEGORY_ERROR;

import java.util.List;
import java.util.stream.Stream;

public enum Menu {
    JAPANESE(Category.JAPANESE, "규동, 우동, 미소시루, 스시, 가츠동, 오니기리, 하이라이스, 라멘, 오코노미야끼"),
    KOREAN(Category.KOREAN, "김밥, 김치찌개, 쌈밥, 된장찌개, 비빔밥, 칼국수, 불고기, 떡볶이, 제육볶음"),
    CHINESE(Category.CHINESE, "깐풍기, 볶음면, 동파육, 짜장면, 짬뽕, 마파두부, 탕수육, 토마토 달걀볶음, 고추잡채"),
    ASIAN(Category.ASIAN, "팟타이, 카오 팟, 나시고렝, 파인애플 볶음밥, 쌀국수, 똠얌꿍, 반미, 월남쌈, 분짜"),
    WESTERN(Category.WESTERN, "라자냐, 그라탱, 뇨끼, 끼슈, 프렌치 토스트, 바게트, 스파게티, 피자, 파니니");

    private final Category category;
    private final List<Food> foods;

    Menu(Category category, String foods) {
        this.category = category;
        this.foods = Stream.of(foods.split(", "))
                .map(Food::new)
                .toList();
    }

    public static List<Food> from(Category category) {
        return Stream.of(values())
                .filter(menu -> menu.category == category)
                .map(menu -> menu.foods)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(SELECT_CATEGORY_ERROR.toString()));
    }
}
