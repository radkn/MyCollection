package test.block8.task2;

import java.util.List;

public class ArrayListOverwriting {

    public static void main(String[] args) {

        List<String> s = new NewArrayList<>();
        s.add("aaa");
        s.add("bbb");
        s.add("ccc");

        s.remove(2);
    }

}
