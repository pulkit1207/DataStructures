package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(2);
        myLinkedList.append(3);

        myLinkedList.removeLast();
        myLinkedList.printList();
        System.out.println();

        myLinkedList.prepend(1);
        myLinkedList.printList();
        System.out.println();

        myLinkedList.removeFirst();
        myLinkedList.printList();
        System.out.println();

        System.out.println(myLinkedList.get(1).value);
        System.out.println();

        myLinkedList.insert(1, 9);
        myLinkedList.printList();
        System.out.println();

        myLinkedList.set(1, 84);
        myLinkedList.printList();
        System.out.println();

        myLinkedList.remove(1);
        myLinkedList.printList();
        System.out.println();

        myLinkedList.reverse();
        myLinkedList.printList();

    }
}
