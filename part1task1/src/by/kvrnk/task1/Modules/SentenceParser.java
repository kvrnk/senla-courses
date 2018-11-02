package by.kvrnk.task1.Modules;

import java.util.ArrayList;
import java.util.List;

public class SentenceParser {
    private static final String delimiter = "[,\\s]+";

    public List<String> getWords(String string) {
        List<String> words = new ArrayList<>();

        for (String word : string.split(delimiter)) {
            char[] chars = word.toLowerCase().toCharArray();
            if (!(chars[0] >= '0' && chars[0] <= '9')) {
                words.add(String.valueOf(word));
            }
        }

        return words;
    }
}
