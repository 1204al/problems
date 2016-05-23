package problem3and4;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class DoublyLinkedList<E> {
    Header<E> header = new Header<>();

    static class Header<E> {
        Node<E> first;
        Node<E> last;
    }

    public DoublyLinkedList() {
    }

    private int size = -1;

    public int getSize() {
        return size;
    }

    public void addLast(E item) {
        Node<E> newNode = new Node<>(null, item, null);
        if (header.first == null) {
            header.first = newNode;
            header.last = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else {
            newNode.prev = header.last;
            header.last.next = newNode;
            newNode.next = header.first;
            header.first.prev = newNode;
            header.last = newNode;
        }
        size++;
    }

    public void removeLast() {

        if (header.first == null) {
            throw new NoSuchElementException("DoublyLinkedList");
        }
        if (header.first == header.last) {
            header.first = null;
            header.last = null;
        } else {
            header.last=header.last.prev;
            header.last.next=header.first;
            header.first.prev=header.last;
        }

        size--;
    }


    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + size;
    }

    public boolean checkElementIndex(int index) {
        return index >= 0 && index <= size;
    }

    public void printList() {
        System.out.println("First :");
        if (header.first == null) {
            System.out.println(">>null<<");
        }

        Node<E> now = header.first;
        for (int i = 0; i <= size; i++) {
            System.out.print("i = " + i);
            System.out.print("    prev = " + now.prev);
            System.out.print("    now = " + now);
            System.out.print("    item = " + now.item);
            System.out.print("    last = " + now.next);
            System.out.println();
            now = now.next;
        }
    }


    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }


}
