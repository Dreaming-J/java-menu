package menu.model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

public class MenuTest {

    @Test
    void 메뉴_선정_테스트() {
        assertEquals(Menu.from(Category.from(1)).get(0), "규동");
        assertEquals(Menu.from(Category.from(4)).get(5), "똠얌꿍");
        assertEquals(Menu.from(Category.from(3)).get(8), "고추잡채");
    }

    @Test
    void 메뉴_출력_확인용_테스트() {
        Stream.of(Category.values())
                .forEach(category -> {
                    System.out.println(Menu.from(category));
                });
    }

    @Test
    void 메뉴_유무_확인_테스트() {
        assertThatThrownBy(() -> Menu.existsFood("김수한무"))
                .isInstanceOf(IllegalArgumentException.class);
        assertDoesNotThrow(() -> Menu.existsFood("떡볶이"));
    }
}
