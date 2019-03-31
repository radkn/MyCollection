package test.block8.owncollection;

public interface MyDeque<E> {

    void addFirst(E e);
    void addLast(E e);

    E removeFirst();
    E removeLast();

    E getFirst();
    void setFirst(E e);

    E getLast();
    void setLast(E e);

    boolean isEmpty();
    int size();
    boolean contains(E e);
}
