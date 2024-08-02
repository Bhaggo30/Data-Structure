public class Queue {
     int maxSize;
     int front;
     int rear;
     int[] queueArray;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = 0;
    }
    public void enqueue(int element) {
        if (rear == maxSize) {
            System.out.println("Queue is full. Can't enqueue element " + element);
        } else {
            queueArray[rear++] = element;
        }
    }
    public int dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty. Can't dequeue element");
            return -1;
        } else {
            return queueArray[front++];
        }
    }
    public int peek() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return queueArray[front];
        }
    }
    public boolean isEmpty() {
        return (front == rear);
    }
    public boolean isFull() {
        return (rear == maxSize);
    }
    public int size() {
        return rear - front;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Size of queue: " + queue.size());
        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Size of queue: " + queue.size());
    }
}