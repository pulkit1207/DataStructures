package doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(2);
        myDLL.printList();
        System.out.println();

        myDLL.append(3);
        myDLL.append(9);
        myDLL.printList();
        System.out.println();

        myDLL.removeLast();
        myDLL.printList();
        System.out.println();

        myDLL.prepend(7);
        myDLL.printList();
        System.out.println();

        myDLL.removeFirst();
        myDLL.printList();
        System.out.println();

        System.out.println(myDLL.get(1).value);
        System.out.println();

        myDLL.set(1, 7);
        myDLL.printList();
        System.out.println();

        myDLL.insert(1, 3);
        myDLL.printList();
        System.out.println();

        myDLL.remove(1);
        myDLL.printList();
        System.out.println();
    }
}
