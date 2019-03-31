package test.block8.owncollection;

import org.junit.Test;

import java.util.Objects;

public class MyHashTableTest {

    @Test
    public void putTestWithDebag(){
        MyMap<TestClass, Integer> myMap = new MyHashMap<>();

        myMap.put(new TestClass("a"), 1);
        myMap.put(new TestClass("c"), 2);
        myMap.put(new TestClass("a"), 3);
        myMap.put(new TestClass("q"), 4);
        myMap.put(new TestClass("p"), 4);
        myMap.put(null, 22);


    }

    class TestClass{
        String key;
        TestClass(String k){
            this.key = k;
        }

        @Override
        public boolean equals(Object o) {
            return key.hashCode() == ((TestClass) o).key.hashCode();
        }

        @Override
        public int hashCode() {
            return key.charAt(0);
        }
    }

}
