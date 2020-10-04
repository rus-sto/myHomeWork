package by.jrr.ruslan.unic_word_counter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.Map;

public class UniqueWordCounter {
    static Logger logger = LoggerFactory.getLogger(UniqueWordCounter.class);

    private UniqueWordCounter() {
    }

    public static void addWord(Map<String, Integer> myMap, String word) {
        if (myMap.containsKey(word)) {
            int i = myMap.get(word);
            i++;
            myMap.put(word, i);
            return;
        }
        myMap.put(word, 1);
    }

    protected static String  getMostFrequentWord(Map<String, Integer> myMap){
        int max = 0;
        String name=null;
        for (Map.Entry<String,Integer> mapV  :myMap.entrySet() ){
            if (mapV.getValue()>=max){
                max=mapV.getValue();
                name = mapV.getKey();
            }
        }return name;
    }

    public static void printWordsFrequency(Map<String, Integer> myMap) {
        for (Map.Entry<String, Integer> myMap2 : myMap.entrySet()) {
            logger.info("Слово - '{}' добавленно - {}раз(а)", myMap2.getKey(),myMap2.getValue() );
        }
    }
}
