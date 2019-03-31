package test.block8.owncollection;

public interface MyMap<K, V> {

    int size();
    boolean containsKey(K k);
    boolean containsValue(V v);

    V put(K k , V v);
    V get(K k);
    V delete(K k);

    interface Entry<K,V>{

        K getKey();
        V getValue();
        V setValue();

        boolean equals(Object o);
        int hashCode();
    }
}
