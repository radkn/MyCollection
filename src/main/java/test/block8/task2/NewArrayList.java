package test.block8.task2;

import javax.management.OperationsException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class NewArrayList<E> extends ArrayList<E> {

    public NewArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public NewArrayList() {
    }

    public NewArrayList(Collection<? extends E> c) {
        super(c);
    }

    @Override
    public E remove(int index){
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        throw new UnsupportedOperationException();
    }
}
