package Homeworks.HW55;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class MainTest {
    @Test
    public void testGetTopWords() {
        List<String> text = Arrays.asList("this is a test", "this is another test");
        List<String> result = TopWords.getTopWords(text);
        Assertions.assertEquals(5, result.size());
        Assertions.assertTrue(result.contains("this"));
        Assertions.assertTrue(result.contains("is"));
        Assertions.assertTrue(result.contains("test"));
        Assertions.assertTrue(result.contains("a"));
        Assertions.assertTrue(result.contains("another"));
    }
}
