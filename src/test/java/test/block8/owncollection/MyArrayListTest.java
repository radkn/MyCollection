package test.block8.owncollection;

import org.junit.Test;

import static java.lang.System.out;

public class MyArrayListTest {

    @Test
    public void add() {
        MyList<String> myList = new MyArrayList<>();
        myList.add("first");
        myList.add("second");
        myList.add("third");

        out.println(myList.get(1));
        out.println(myList.size());

        myList.update(1,"secondUpdate");
        out.println(myList.get(1));

        myList.delete(1);
        out.println(myList.get(1));

        for (String s :
                myList) {
            out.println(s);
        }
    }

    @Test
    public void delete() {
    }

    @Test
    public void get() {
    }

    @Test
    public void size() {

    }

    @Test
    public void update() {
    }

    @Test
    public void iterator() {
    }
}