package test.block8.owncollection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyLinkedListTest extends Assert {

    @Test
    public void addElementTest() {
        MyDeque<String> deque = new MyLinkedList<>();

        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");

        assertEquals("a", deque.getFirst());
        assertEquals("c", deque.getLast());
    }

    @Test
    public void getByIndexTest() {
        MyList<String> myList = new MyLinkedList<>();

        myList.add("a");
        myList.add("b");
        myList.add("c");

        assertEquals("a", myList.get(0));
        assertEquals("b", myList.get(1));
        assertEquals("c", myList.get(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getByWrongIndexTest() {
        MyList<String> myList = new MyLinkedList<>();

        myList.add("a");

        myList.get(1);
    }

    @Test
    public void removeTest(){
        MyDeque<String> deque = new MyLinkedList<>();

        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");

        deque.removeFirst();
        deque.removeLast();
        assertEquals("b", deque.getFirst());
        assertEquals("b", deque.getLast());
        assertEquals(1, deque.size());
    }

    @Test(expected = NoSuchElementException.class)
    public void removeWrongTest(){
        MyDeque<String> deque = new MyLinkedList<>();
        deque.removeFirst();
    }

    @Test
    public void deleteTest(){
        MyList<String> myList = new MyLinkedList<>();

        myList.add("a");
        myList.add("b");
        myList.add("c");

        myList.delete(1);

        assertEquals("a", myList.get(0));
        assertEquals("c", myList.get(1));
        assertEquals(2,myList.size());
    }

    @Test
    public void deleteAllOneByOneTest(){
        MyList<String> myList = new MyLinkedList<>();

        myList.add("a");
        myList.add("b");
        myList.add("c");

        myList.delete(0);
        myList.delete(0);
        myList.delete(0);

        assertEquals(0,myList.size());
    }

    @Test
    public void containsTest(){
        MyList<String> myList = new MyLinkedList<>();

        myList.add("a");
        myList.add("b");
        myList.add("c");

        String a = "a";

        assertTrue(myList.contains("a"));
        assertTrue(myList.contains("b"));
        assertTrue(myList.contains("c"));
        assertFalse(myList.contains("d"));
        assertTrue(myList.contains(a));
    }

    @Test
    public void getIndexOfTest(){
        MyList<String> myList = new MyLinkedList<>();

        myList.add("a");
        myList.add("b");
        myList.add("c");

        assertEquals(0, myList.getIndexOf("a"));
        assertEquals(1, myList.getIndexOf("b"));
        assertEquals(2, myList.getIndexOf("c"));
        assertEquals(-1, myList.getIndexOf("e"));
    }


}