package hm_9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TaskThree {
    public static void frequencyOfWordsInTheText(String link) {
        List<String> words = new ArrayList<>();
        Map<String, Integer> frequency = new TreeMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(link))) {
            String word;
            while ((word = bufferedReader.readLine()) != null) {
                String[] part = word.split(" ");
                words.addAll(Arrays.asList(part));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        for (String ch : words) {
            if (frequency.containsKey(ch)) {
                int val = frequency.get(ch) + 1;
                frequency.put(ch, val);
            } else {
                frequency.put(ch, 1);
            }
        }
        frequency.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}
