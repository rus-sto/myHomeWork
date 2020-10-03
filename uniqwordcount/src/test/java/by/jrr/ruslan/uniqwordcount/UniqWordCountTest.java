package by.jrr.ruslan.uniqwordcount;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class UniqWordCountTest {

    UniqWordCount uniqWordCount;

        @Before
        public void setup() {
            uniqWordCount = new UniqWordCount();// создается объект и вызывается конструктор этого объекта,
            // и этот конструктор возвращает экземпляр этого объекта,
            // и возвращает адрес этого объекта в куче
        }

        @Test
        public void addWordSizeTest() {
            uniqWordCount.addWord("shop my love");
            int expected = 3;
            int actual = uniqWordCount.getVocabulary().size();
            assertEquals(expected, actual);
        }

        @Test
        public void addWordWordsTest() {
            Set<String> expected = new HashSet<>();
            expected.add("shop");
            expected.add("love");
            expected.add("my");
            uniqWordCount.addWord("shop my love");
            Set<String> actual = uniqWordCount.getVocabulary();
            assertEquals(expected, actual);
        }

        @Test
        public void addWordNullTest() {
//        Set<String> expected = new HashSet<>();
            Set<String>  expected = null;
            uniqWordCount.addWord(null);

            Set<String> actual = uniqWordCount.getVocabulary();
            assertEquals(expected, actual);
        }

        @Test
        public void addWordEmptyTest() {
//        Set<String> expected = new HashSet<>();
            Set<String>  expected = null;
            uniqWordCount.addWord("");
            Set<String> actual = uniqWordCount.getVocabulary();
            assertEquals(expected, actual);
        }

//      @Test
//    public void addWordSize1Test() {
//        Set<String> setName = new HashSet<>();
//        setName.add("");
//        int expected = 1;
//        int actual = setName.size();
//        assertEquals(expected, actual);
//    }

        @Test
        public void getWordsCountTest() {
            uniqWordCount.addWord("shop my love");
            int expected = 3;
            int actual = uniqWordCount.getWordsCount();
            assertEquals(expected,actual);
        }

        @Test
        public void printVocabularyTest(){
            uniqWordCount.addWord("shop my love");
            String expected ="UnicWordVoc{vocabulary=[love, shop, my]}";
            String actual =uniqWordCount.toString();
            assertEquals(expected, actual);

        }
    }
