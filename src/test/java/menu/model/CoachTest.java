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
}
