package test;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueryBridgeWordsTest {

    @Test
    public void testValidInput() {
        String result = Main.queryBridgeWords("apple", "orange");
        assertEquals("bridge_word1 bridge_word2", result);
    }

    @Test
    public void testEmptyInput() {
        String result = Main.queryBridgeWords("", "banana");
        assertEquals("-1", result);
    }

    @Test
    public void testNonexistentWords() {
        String result = Main.queryBridgeWords("pineapple", "banana");
        assertEquals("-1", result);
    }

    // 추가 테스트 케이스를 필요에 따라 작성합니다.
}
