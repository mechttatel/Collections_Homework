package exercise;

import java.util.*;

public class Exercise6 extends Exercise {

    @Override
    public void start() {
        HashMap<String, Integer> sourceMap = new HashMap<>();

        sourceMap.put("key1", 1);
        sourceMap.put("key2", 2);
        sourceMap.put("key3", 3);
        sourceMap.put("key4", 2);
        sourceMap.put("key5", 1);
        sourceMap.put("key6", 1);

        System.out.println("Исходная коллекция - " + sourceMap);
        System.out.println("Результат - " + reverseMap(sourceMap));
    }


    private <T,U> Map<U, Collection<T>> reverseMap(Map<T, U> map) {
        Map<U, Collection<T>> result = new HashMap<>();

        for (Map.Entry<T, U> entry : map.entrySet()) {
            result.merge(
                    entry.getValue(),
                    new ArrayList<>(List.of(entry.getKey())),
                    (prev, next) -> {
                        prev.addAll(next);
                        return prev;
                    });
        }

        return result;
    }
}
