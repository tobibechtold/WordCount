package de.readmore.demo.wordcount;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> wordOccurenceMap = new HashMap<String, Integer>();
        for (String word : words) {
            Integer oldCounter = wordOccurenceMap.get(word);
            if (oldCounter == null) {
                wordOccurenceMap.put(word, 1);
            } else {
                wordOccurenceMap.put(word, oldCounter + 1);
            }
        }

        return wordOccurenceMap;
    }
}
