import java.util.Scanner;

class Queue {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    public void enque(Scanner scanner) {
        System.out.println("enter the data");
        int data = scanner.nextInt();
        Node new_Node = new Node(data);
        if (front == null && rear == null) {
            front = new_Node;
            rear = new_Node;
        } else {
            rear.next = new_Node;
            rear = new_Node;
        }
    }

    public void deque() {
        if (front == null && rear == null) {
            System.out.println("queue is empty");
        } else {
            front = front.next;
        }
    }

    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data + " ->");
            temp = temp.next;
        }
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int l =0;
        Queue queue = new Queue();
        do {
            System.out.println("press 1 to enque the data");
            System.out.println("press 2 to deque the data");
            System.out.println("press 3 to display the data");
            System.out.println("enter your choice ");
             a = scanner.nextInt();
            switch (a) {
                case 1:
                    queue.enque(scanner);
                    System.out.println("data inserted successfully");
                    break;
                case 2:
                    queue.deque();
                    System.out.println("data deleted successfully");
                    break;
                case 3:
                    queue.display();
                    System.out.println("display the data ");
                    break;
                default:
                    System.out.println("press any key to exit ");
                    l = scanner.nextInt();
            }
        }
            while (l == 0) ;
            System.out.println("exit successfully");
        }
    }
