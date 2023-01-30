package Homeworks.HW55;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopWords {
    public static List<String> getTopWords(List<String> text) {
        List<String> words = new ArrayList<>();
        for (String line : text) {
            String[] split = line.split("\\s+");
            for (String word : split) {
                words.add(word);
            }
        }

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCount.entrySet());
        Collections.sort(sortedWords, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        List<String> topWords = new ArrayList<>();
        for (int i = 0; i < 10 && i < sortedWords.size(); i++) {
            topWords.add(sortedWords.get(i).getKey());
        }

        return topWords;
    }
}
