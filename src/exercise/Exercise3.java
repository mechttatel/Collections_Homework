package exercise;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 extends Exercise {

    @Override
    public void start() {
        System.out.println("Введите текст:");
        String text = scanner.next();
        System.out.println(makeFrequencyDictionary(text));

    }

    private Map<Character, Integer> makeFrequencyDictionary(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        char[] textCharArray = text.toCharArray();

        for (char symbol : textCharArray) {
            if (Character.isLetter(symbol)) {
                int frequencyCount = frequencyMap.getOrDefault(symbol, 0) + 1;
                frequencyMap.put(symbol, frequencyCount);
            }
        }

        return frequencyMap;
    }
}
