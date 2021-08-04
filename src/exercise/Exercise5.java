package exercise;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Exercise5 extends Exercise {
    private final int ELEMENT_COUNT = 1000000;
    private final int TAKE_COUNT = 10000;

    @Override
    public void start() {
        System.out.println("В ходе эксперимента оказалось, что добавление в ArrayList происходит намного быстрее,\n" +
                "чем в LinkedList, а если сразу поставить capacity на нужное количество символов, можно выиграть\n" +
                "еще ~15 милисекунд. Как я думаю, это связанно с тем, что LinkedList каждый раз создает обертку для объекта\n" +
                "и меняет связи между соседями, из-за чего такая огромная разница");

        System.out.println("С получением элемента результат очевиден, так как ArrayList обращается по индексу за константное время,\n" +
                "а LinkedList перебирает элементы до нужного индекса за линейное время, что достаточно долго");


        System.out.println("Замеры в ArrayList");
        List<Integer> arrayList = addToListTime(new ArrayList<>(ELEMENT_COUNT));
        takeRandomElements(arrayList);

        System.out.println("Замеры в LinkedList");
        List<Integer> linkedList = addToListTime(new LinkedList<>());
        System.out.println("Сейчас будет долго...");
        takeRandomElements(linkedList);
        System.out.println("А я говорил)");
    }

    private List<Integer> addToListTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < ELEMENT_COUNT; i++) {
            list.add(i);
        }

        long finishTime = System.currentTimeMillis();
        System.out.println("Время добавления элементов в мс: " + (finishTime - startTime));

        return list;
    }

    private void takeRandomElements(List<Integer> list) {
        Random random = new Random(100000);
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < TAKE_COUNT; i++) {
            int takenDigit = list.get(random.nextInt(ELEMENT_COUNT));
        }

        long finishTime = System.currentTimeMillis();
        System.out.println("Время получения элементов в мс: " + (finishTime - startTime));
    }
}
