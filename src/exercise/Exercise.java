package exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public abstract class Exercise {
    protected Scanner scanner = new Scanner(System.in);

    public abstract void start();

    protected Collection<Integer> readCollection() {
        Collection<Integer> collection = new ArrayList<>();
        System.out.println("Для завершения ввода элементов введите любой символ, кроме числа");
        while (true) {
            try {
                int inputDigit = scanner.nextInt();
                collection.add(inputDigit);
            } catch (Exception e) {
                scanner.next();
                System.out.println("Ввод завершен");
                return collection;
            }
        }
    }
}
