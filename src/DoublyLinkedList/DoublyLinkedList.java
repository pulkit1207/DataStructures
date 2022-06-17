package DoublyLinkedList;

public class DoublyLinkedList {
    class Node {
        int value;
        Node next;
        Node previous;

        public Node(int value) {
            this.value = value;
        }
    }

    Node head;
    Node tail;
    int length;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public Node removeLast() {
        Node temp = tail;
        if (length == 0) return null;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.previous;
            tail.next = null;
            temp.previous = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        Node temp = head;
        if (length == 0) return null;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.previous = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.previous;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }


}
