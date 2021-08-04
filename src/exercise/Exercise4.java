package exercise;

import java.util.LinkedHashSet;
import java.util.Set;

public class Exercise4 extends Exercise{

    @Override
    public void start() {
        Set<Integer> set = new LinkedHashSet<>(readCollection());
        System.out.println(set);
    }
}
