import java.util.Scanner;

class Node {
    int val;
    Node next;
}

public class StackUsingLinkedList {
    Node head;

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        System.out.println("Stack operations using linked list");
        System.out.println("------");

        while (choice != 4) {
            System.out.println("\n\nChose one from the below options...");
            System.out.println("1.Push\n2.Pop\n3.Show\n4.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    stack.push();
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Please Enter a valid choice");
            }
        }
        sc.close();
    }

    void push() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int val = sc.nextInt();
        Node node = new Node();
        node.val = val;

        if (head == null) {
            node .next = null;
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        System.out.println("Item pushed");
    }

    void pop() {
        if (head == null) {
            System.out.println("Underflow");
        } else {
            int item = head.val;
            head = head.next;
            System.out.println("Item popped: " + item);
        }
    }

    void display() {
        if (head == null) {
            System.out.println("Stack is empty");
        } else {
            Node ptr = head;
            System.out.println("Printing Stack elements:");
            while (ptr != null) {
                System.out.println(ptr.val);
                ptr = ptr.next;
            }
        }
    }
}
