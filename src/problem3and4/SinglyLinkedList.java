package problem3and4;

public class SinglyLinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    int size = -1;

    public void add(E item) {
        Node<E> newNode = new Node<>(item, null);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + size;
    }

    public void remove(int index) {
        if (!checkElementIndex(index)) throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        if (first == null) {
            first = first.next;
            size--;
            return;
        }
        Node now = first;
        Node beforeNow = null;
        int i = 0;
        while (i < index) {
            beforeNow = now;
            now = now.next;
            i++;
        }
        beforeNow.next = now.next;
        size--;
    }

    public boolean checkElementIndex(int index) {
        return index >= 0 && index <= size;
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        int size = 0;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public void printList() {
        if (first == null) {
            System.out.println(">>null<<");
        }
        System.out.println("First :");
        Node<E> now = first;
        for (int i = 0; i < size; i++) {
            System.out.print("i = " + i);
            System.out.print("    now = " + now);
            System.out.print("    item = " + now.item);
            System.out.print("    last = " + now.next);
            System.out.println();
            now = now.next;


        }
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "first=" + first +
                ", last=" + last +
                ", size=" + size +
                '}';
    }
}
