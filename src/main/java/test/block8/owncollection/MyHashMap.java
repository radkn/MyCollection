package test.block8.owncollection;

import java.util.Map;

public class MyHashMap<K, V> implements MyMap<K, V> {

    private int size;
    private Node<K,V> table[];

    private int capacity = 16;

    public MyHashMap() {
        this.table = (Node<K,V>[])new Node[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean containsKey(K k) {
        return false;
    }

    @Override
    public boolean containsValue(V v) {
        return false;
    }

    @Override
    public V put(K k, V v) {

        V oldV;
        if (k == null){
            Node<K, V> node = table[0];
            if(table[0] != null){
                while (node.next!=null){
                    if (node.key == null) {
                        oldV = node.value;
                        node.value = v;
                        return oldV;
                    }
                    node = node.next;
                }
                oldV = putInStart(0, k, v);
                return oldV;
            }
            table[0] = new Node<>(0, null, v, null);
            return null;
        }

        int index = getIndex(k);
        if(table[index]!= null){
            for (Node<K, V> node = table[index]; node != null; node = node.next) {
                if (node.key.equals(k)) {
                    oldV = node.value;
                    node.value = v;
                    return oldV;
                }
            }
        }
        oldV = putInStart(index, k, v);
        return oldV;
    }

    private V putInStart(int index, K k, V v) {
        int hash = k== null ? 0 : hash(k);
        Node<K,V> newNode = new Node<>(hash, k, v, table[index]);
        V oldV = null;
        if(table[index]!=null){
            oldV = table[index].value;
        }
        table[index] = newNode;
        return oldV;
    }

    @Override
    public V get(K k) {
        return null;
    }

    @Override
    public V delete(K k) {
        return null;
    }

    private int getIndex(K k){
        int h = hash(k);
        return (h^(h>>>16)) & (capacity-1) ;
    }

    public int hash(K k){

        return k.hashCode();
    }

    static class Node<K,V> {

        final private int hash;
        final private K key;
        private V value;
        private Node<K,V> next;

        Node(int hash, K key, V value, Node<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public boolean equals(Object o){

            return false;
        }

        public int hashCode(){

            return 0;
        }
    }
}
