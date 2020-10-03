package by.jrr.ruslan.uniquewordvocabulary;

import java.util.Arrays;

        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;

        import java.util.HashSet;
        import java.util.Set;

public class UnicWordVoc {
    Logger logger = LoggerFactory.getLogger(UnicWordVoc.class);

    private Set<String> vocabulary;  //это просто ссылка (сейчас это нал)

    public Set<String> getVocabulary() {
        return vocabulary;
    }

    void addWord(String word) {
        if (word != null && !word.equals("")) {
            vocabulary = new HashSet<>();
            vocabulary.addAll(Arrays.asList(word.split(" ")));
        }

    }

    public int getWordsCount() {
        return vocabulary.size();
    }

    @Override
    public String toString() {
        return "UnicWordVoc{" +
                "vocabulary=" + vocabulary +
                '}';
    }

    public void printVocabulary() {
        logger.info(toString());
    }
}

