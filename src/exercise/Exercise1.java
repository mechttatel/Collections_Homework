package exercise;

import java.util.HashSet;
import java.util.Set;

public class Exercise1 extends Exercise {

    public void start() {
        Set<Integer> firstSet = new HashSet<>(readCollection());
        Set<Integer> secondSet = new HashSet<>(readCollection());

        Set<Integer> result = difference(firstSet, secondSet);
        System.out.println("Результат - " + result);
    }

    private Set<Integer> difference(Set<Integer> setFirst, Set<Integer> setSecond) {
        Set<Integer> result = new HashSet<>();

        setFirst.stream()
                .filter(i -> !setSecond.contains(i))
                .forEach(result::add);

        setSecond.stream()
                .filter(i -> !setFirst.contains(i))
                .forEach(result::add);

        return result;
    }
}
