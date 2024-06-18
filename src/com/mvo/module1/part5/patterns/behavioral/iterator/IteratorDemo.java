package src.com.mvo.module1.part5.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            Integer number = iterator.next();
            System.out.println(number);
        }
    }
}
