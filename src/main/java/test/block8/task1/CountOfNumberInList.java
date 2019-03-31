package test.block8.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountOfNumberInList {
    public static void main(String[] args) {
        List<Integer> numbers = createList();

        printCountOfNumbersByStream(numbers);

    }

    static List<Integer> createList(){
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(-6);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);

        return numbers;
    }

    static void printCountOfNumbersByStream(List<Integer> numbers){
        Map<Integer, Integer> count = new TreeMap<Integer, Integer>();

        numbers.forEach(n -> count.put(n, count.getOrDefault(n,0)+1));

        count.forEach((k,v) -> System.out.println(k+ " = " +v));
    }

    static void printCountOfNumbersByForEach(List<Integer> numbers){
        Map<Integer, Integer> count = new TreeMap<Integer, Integer>();
        for (Integer n : numbers) {
            if (!count.containsKey(n)){
                count.put(n,1);
            }else {
                count.put(n,count.get(n)+1);
            }
        }

        count.forEach((k,v) -> System.out.println(k+ " = " +v));
    }
}
