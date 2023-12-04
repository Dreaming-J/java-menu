package menu.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    void 카테고리_뽑기_테스트() {
        assertEquals(Category.get(1), Category.JAPANESE);
        assertEquals(Category.get(2), Category.KOREAN);
        assertEquals(Category.get(3), Category.CHINESE);
        assertEquals(Category.get(4), Category.ASIAN);
        assertEquals(Category.get(5), Category.WESTERN);
    }
}
