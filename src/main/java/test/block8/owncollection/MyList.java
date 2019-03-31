package test.block8.owncollection;

public interface MyList<E>  extends Iterable<E> {
    boolean add(E e);
    void delete(int index);
    E get(int index);
    int getIndexOf(E e);
    int size();
    void update(int index, E e);
    boolean isEmpty();
    boolean contains(E e);
}
