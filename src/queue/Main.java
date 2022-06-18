package queue;

public class Main {

    public static void main(String[] args) {
        Queue myQueue = new Queue(1);
        myQueue.printQueue();
        System.out.println();

        myQueue.enque(2);
        myQueue.enque(3);
        myQueue.enque(4);
        myQueue.printQueue();
        System.out.println();

        myQueue.dequeue();
        myQueue.printQueue();
    }
}
