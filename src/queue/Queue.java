package queue;

public class Queue {
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int length;

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst() {
        System.out.println(first.value);
    }

    public void getLast() {
        System.out.println(last.value);
    }

    public void getLength() {
        System.out.println(length);
    }

    public void enque(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        length++;
    }

    public Node dequeue() {
        Node temp = first;
        if (length == 0) return null;
        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = temp.next;
            temp.next = null;
        }
        length--;
        return temp;
    }
}
