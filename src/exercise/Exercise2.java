package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercise2 extends Exercise {

    @Override
    public void start() {
        List<Integer> list = new ArrayList<>(readCollection());
        List<Integer> result = processList(list);
        System.out.println("Результат - " + result);
    }

    private List<Integer> processList(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            iterator.next();
            if (i % 2 == 0) {
                iterator.remove();
            }
            i++;
        }

        Collections.reverse(list);
        return list;
    }
}
