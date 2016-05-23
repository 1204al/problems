package problem3and4;

public class Main {
    public static void main(String[] args) {
//        SinglyLinkedList<Integer> l1=new SinglyLinkedList<>();
//
//        l1.printList();
//        System.out.println(l1.getFirst());
//        System.out.println(l1.getLast());
//        l1.add(1);
//        System.out.println(l1.getFirst());
//        System.out.println(l1.getLast());
//        l1.printList();
//        l1.add(2);
//        l1.add(3);
//        l1.add(4);
//        l1.add(5);
//        l1.printList();
//        System.out.println();
//        l1.remove(4);
//        l1.printList();
//        System.out.println(l1.getFirst());
//        System.out.println(l1.getLast());
//
//        System.out.println();
//        System.out.println();
        DoublyLinkedList<Integer> l2=new DoublyLinkedList<>();
        l2.addLast(1);
        l2.addLast(2);
        l2.addLast(3);
        l2.addLast(4);
        l2.addLast(5);
        l2.printList();
        l2.removeLast();
        l2.removeLast();
        l2.removeLast();
        l2.removeLast();
        l2.printList();
        System.out.println(l2.getSize());

        l2.removeLast();
        System.out.println(l2.getSize());
        l2.printList();

        l2.printList();
l2.addLast(1);
l2.addLast(2);
        l2.removeLast();
        l2.removeLast();
//        System.out.println("A"+l2.getSize());
//        System.out.println("l2.header.first = " + l2.header.first);
//        System.out.println("l2.header.last = " + l2.header.last);
//        l2.printList();


        System.out.println(l2.getSize());

        l2.printList();

    }
}
