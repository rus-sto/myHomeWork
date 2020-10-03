package by.jrr.ruslan.unic_word_counter;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class UniqueWordCounterTest {
    Map<String, Integer> myMap1;

    @Before
    public void setUp() {
        myMap1 = new HashMap<>();
    }

    @Test
    public void addWordNew() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Green", 1);
        expected.put("Blue", 1);

        UniqueWordCounter.addWord(myMap1, "Green");
        UniqueWordCounter.addWord(myMap1, "Blue");
        Map<String, Integer> actual = myMap1;
        assertEquals(expected, actual);
    }
    @Test
    public void addWordNext() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Green", 2);
        expected.put("Blue", 1);

        UniqueWordCounter.addWord(myMap1, "Green");
        UniqueWordCounter.addWord(myMap1, "Blue");
        UniqueWordCounter.addWord(myMap1, "Green");
        Map<String, Integer> actual = myMap1;
        assertEquals(expected, actual);
    }

    @Test
    public void getMostFrequentWord() {
        UniqueWordCounter.addWord(myMap1, "Green");
        UniqueWordCounter.addWord(myMap1, "Blue");
        UniqueWordCounter.addWord(myMap1, "Green");
        String expected = "Green";
        String actual = UniqueWordCounter.getMostFrequentWord(myMap1);
        assertEquals(expected, actual);
    }

}