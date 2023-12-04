package menu.model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class TeamTest {

    @Test
    void 팀_생성_테스트() {
        assertDoesNotThrow(() -> new Team("가가,나나"));
        assertDoesNotThrow(() -> new Team("가가,나나,다다,라라,마마"));
        assertThatThrownBy(() -> new Team("가가,나나,다다,라라,마마,바바"))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> new Team("가가"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
