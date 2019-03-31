package test.block8.owncollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements MyList<E>, MyDeque<E> {

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;
    ArrayList

    public MyLinkedList() {
    }

    @Override
    public void addFirst(E e) {
        Node<E> next = firstNode;
        firstNode = new Node<>(e, null, next);
        if (next == null) {
            lastNode = firstNode;
        } else {
            next.prevNode = firstNode;
        }
        size++;

    }

    @Override
    public void addLast(E e) {
        Node<E> prev = lastNode;
        lastNode = new Node<>(e, prev, null);
        if (prev == null) {
            firstNode = lastNode;
        } else {
            prev.nextNode = lastNode;
        }
        size++;
    }

    @Override
    public E removeFirst() {
        if(firstNode==null){
            throw new NoSuchElementException();
        }
        Node<E> oldFirstNode = firstNode;
        firstNode = firstNode.nextNode;
        size--;
        return oldFirstNode.currentElement;
    }

    @Override
    public E removeLast() {

        Node<E> oldLastNode = lastNode;
        lastNode = lastNode.prevNode;
        size--;
        return oldLastNode.currentElement;
    }

    @Override
    public E getFirst() {
        if(firstNode==null){
            throw new NoSuchElementException();
        }
        return firstNode.currentElement;
    }

    @Override
    public void setFirst(E e) {
        firstNode.currentElement = e;
    }

    @Override
    public E getLast() {
        if(lastNode==null){
            throw new NoSuchElementException();
        }
        return lastNode.currentElement;
    }

    @Override
    public void setLast(E e) {
        lastNode.currentElement = e;

    }

    @Override
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override
    public void delete(int index) {
        checkIndex(index);

        Node<E> currentNode = getNode(index);

        Node<E> prev = currentNode.prevNode;
        Node<E> next = currentNode.nextNode;

        if(index == 0 && index == size-1){
            firstNode = lastNode = null;
            size = 0;
            return;
        }

        if(index == 0){
            next.prevNode = null;
            firstNode = next;
        }else {
            prev.nextNode = next;
        }

        if(index==size-1){
            prev.nextNode = null;
            lastNode = prev;
        }else {
            next.prevNode = prev;
        }
            size--;
    }

    @Override
    public E get(int index) {
        return getNode(index).currentElement;
    }

    @Override
    public int getIndexOf(E e) {
        if (isEmpty()) {
            return -1;
        }
        int index = 0;
        while (index<size){
            if(e.equals(get(index))){
                return index;
            }
            index++;
        }
        return -1;
    }

    private Node<E> getNode(int i){
        checkIndex(i);
        Node<E> target = firstNode;
        for (int j = 0; j < i; j++) {
            target = target.nextNode;
        }
        return target;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void update(int index, E e) {
        checkIndex(index);
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(E e) {
        return getIndexOf(e) != -1;

    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    private class Node<E> {
        private E currentElement;
        private Node<E> prevNode;
        private Node<E> nextNode;

        public Node(E currentElement, Node<E> prevNode, Node<E> nextNode) {
            this.currentElement = currentElement;
            this.prevNode = prevNode;
            this.nextNode = nextNode;
        }
    }

    private void checkIndex(int index) {
        if (!isIndexActual(index)) {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean isIndexActual(int i) {
        return i >= 0 && i < size;
    }

    private class LinkedIterator<E> implements Iterator<E>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }
}
