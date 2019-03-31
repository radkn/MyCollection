package test.block8.owncollection;

import java.util.Iterator;

public class MyArrayList<E> implements MyList<E> {

    private E[] values;

    public MyArrayList() {


        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException c) {
            c.printStackTrace();
        }

        return false;
    }

    @Override
    public void delete(int index) {

        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int countOfElementAterIndex = temp.length - index;
            System.arraycopy(temp, index + 1, values, index, temp.length - index - 1);
        } catch (Exception e) {

        }

    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int getIndexOf(E e) {
        return 0;
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public boolean isEmpty() {
        return values.length==0;
    }

    @Override
    public boolean contains(E e) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }
}
