public class SLLMain13 {
    public static void main(String[] args) {
        LinkedList13 myLinkedList15 = new LinkedList13();
        myLinkedList15.print();
        myLinkedList15.addFirst(800);
        myLinkedList15.print();
        myLinkedList15.addFirst(700);
        myLinkedList15.print();
        myLinkedList15.addLast(500);
        myLinkedList15.print();
        myLinkedList15.insertAfter(700, 300);
        myLinkedList15.print();

        System.out.println("Data pada index ke-1: " + myLinkedList15.getData(1));
        System.out.println("Data 300 berada pada index ke: " + myLinkedList15.indexxOf(300));
        myLinkedList15.remove(300);
        myLinkedList15.print();
        myLinkedList15.removeFirst();
        myLinkedList15.print();
        myLinkedList15.removeLast();
        myLinkedList15.print();

        myLinkedList15.addLast(100);
        myLinkedList15.addLast(200);
        myLinkedList15.addLast(300);
        myLinkedList15.addLast(400);
        myLinkedList15.addLast(500);
        System.out.println("Linked list awal:");
        myLinkedList15.removeFirst();
        myLinkedList15.print();
        myLinkedList15.insertBefore(300, 250);
        System.out.println("Linked list setelah insertBefore 300 dengan 250:");
        myLinkedList15.print();
        myLinkedList15.insertAt(2, 150);
        System.out.println("Linked list setelah insertAt index 2 dengan 150:");
        myLinkedList15.print();
        myLinkedList15.removeAt(3);
        System.out.println("Linked list setelah removeAt index 3:");
        myLinkedList15.print();
    }
}
