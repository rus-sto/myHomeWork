package by.jrr.ruslan.unicwordvoc;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class UnicWordVocTest {

    UnicWordVoc unicWordVoc;

    @Before
    public void setup() {
        unicWordVoc = new UnicWordVoc();// создается объект и вызывается конструктор этого объекта,
        // и этот конструктор возвращает экземпляр этого объекта,
        // и возвращает адрес этого объекта в куче
    }

    @Test
    public void addWordSizeTest() {
        unicWordVoc.addWord("shop my love");
        int expected = 3;
        int actual = unicWordVoc.getVocabulary().size();
        assertEquals(expected, actual);
    }

    @Test
    public void addWordWordsTest() {
        Set<String> expected = new HashSet<>();
        expected.add("shop");
        expected.add("love");
        expected.add("my");
        unicWordVoc.addWord("shop my love");
        Set<String> actual = unicWordVoc.getVocabulary();
        assertEquals(expected, actual);
    }

    @Test
    public void addWordNullTest() {
//        Set<String> expected = new HashSet<>();
        Set<String>  expected = null;
        unicWordVoc.addWord(null);

        Set<String> actual = unicWordVoc.getVocabulary();
        assertEquals(expected, actual);
    }

    @Test
    public void addWordEmptyTest() {
//        Set<String> expected = new HashSet<>();
        Set<String>  expected = null;
        unicWordVoc.addWord("");
        Set<String> actual = unicWordVoc.getVocabulary();
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
        unicWordVoc.addWord("shop my love");
        int expected = 3;
        int actual = unicWordVoc.getWordsCount();
        assertEquals(expected,actual);
            }

    @Test
    public void printVocabularyTest(){
          unicWordVoc.addWord("shop my love");
        String expected ="UnicWordVoc{vocabulary=[love, shop, my]}";
        String actual =unicWordVoc.toString();
                assertEquals(expected, actual);

    }
}


