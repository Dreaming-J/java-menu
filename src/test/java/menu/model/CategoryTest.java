package menu.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    void 카테고리_뽑기_테스트() {
        assertEquals(Category.from(1), Category.JAPANESE);
        assertEquals(Category.from(2), Category.KOREAN);
        assertEquals(Category.from(3), Category.CHINESE);
        assertEquals(Category.from(4), Category.ASIAN);
        assertEquals(Category.from(5), Category.WESTERN);
    }
}
