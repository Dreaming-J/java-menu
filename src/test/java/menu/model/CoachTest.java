package menu.model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class CoachTest {

    @Test
    void 이름_테스트() {
        assertThatThrownBy(() -> new Coach("김"))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Coach("김수한무두"))
                .isInstanceOf(IllegalArgumentException.class);
        assertDoesNotThrow(() -> new Coach("김수한무"));
        assertDoesNotThrow(() -> new Coach("김수"));
    }

    @Test
    void 못_먹는_메뉴_테스트() {
        Coach coach = new Coach("김수한무");
        assertThatThrownBy(() -> coach.createHateFood("마파두부,마파두부"))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> coach.createHateFood("두루미"))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> coach.createHateFood("마파두부,떡볶이,우동"))
                .isInstanceOf(IllegalArgumentException.class);
        assertDoesNotThrow(() -> coach.createHateFood(""));
        assertDoesNotThrow(() -> coach.createHateFood("마파두부"));
        assertDoesNotThrow(() -> coach.createHateFood("마파두부,스시"));
    }

    @Test
    void 추천_음식_저장() {
        Coach coach = new Coach("김수한무");
        coach.createHateFood("스시,피자");
        assertDoesNotThrow(() -> coach.setMenu("마파두부"));
        assertThatThrownBy(() -> coach.setMenu("마파두부"))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> coach.setMenu("스시"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
