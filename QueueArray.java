import java.util.Scanner;

class QueueA {
    int front = -1;
    int rear = -1;
    int n = 5;
    int[] queue = new int[n];

    public void enque(Scanner sc) {
        if (rear == (n - 1)) {
            System.out.println("queue is overflow");
        } else {
            System.out.println("enter the data to be inserted");
            int i = sc.nextInt();
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
                queue[rear] = i;
            } else {
                rear = rear + 1;
                queue[rear] = i;
            }
        }
    }

    public void dequeu() {
        if (front == -1 && rear == -1) {
            System.out.println("stack underflow");
        } else {
            front = front + 1;
        }
    }

    public void display() {
        System.out.println("item are to be inserted");
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }

}

public class QueueArray {
    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);
        QueueA queue = new QueueA();
        int l = 0;
        do {
            System.out.println("1 : press to enter the data");
            System.out.println("2  : press enter to delete the data");
            System.out.println("3 : display the data");
            System.out.println("enter your choice ");
            d = sc.nextInt();
            switch (d) {
                case 1:
                    queue.enque(sc);
                    System.out.println("data inserted successfully");
                    break;
                case 2:
                    queue.dequeu();
                    System.out.println("data deleted successfully");
                    break;
                case 3:
                    queue.display();
                    System.out.println("display the data");
                    break;
                default:
                    System.out.println("press any key to exit");
                    l = sc.nextInt();
            }
        }
        while (l == 0);
        System.out.println("exit successfully");


    }


}

