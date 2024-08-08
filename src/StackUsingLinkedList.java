
import java.util.Scanner;

class Stack {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    public void pushNode(Scanner scanner) {
        System.out.println("enter data");
        int data = scanner.nextInt();
        Node new_Node = new Node(data);
        if (top == null) {
            top = new_Node;
        } else {
            new_Node.next = top;
            top = new_Node;
        }
    }

    public void popNode() {
        if (top == null) {
            System.out.println("stack is empty");
        } else {
            top = top.next;
        }
    }

    public void displayStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data + " ->");
            temp = temp.next;
        }
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        int d, l = 0;
        Scanner scanner = new Scanner(System.in);
        Stack list = new Stack();
        do {
            System.out.println("press 1 to enter data in stack");
            System.out.println("press 2 to delete data in the stack");
            System.out.println("press 3 to dispaly data in the stack");
            System.out.println("enter your choice ");
            d = scanner.nextInt();
            switch (d) {
                case 1:
                    list.pushNode(scanner);
                    System.out.println("data inserted successfully");
                    break;
                case 2:
                    list.popNode();
                    System.out.println("data deleted successfully");
                    break;
                case 3:
                    list.displayStack();
                    System.out.println("display the data in the stack");
                    break;
                default:
                    System.out.println("invalid choice press any key to exit ");
                    l= scanner.nextInt();
            }
        }
        while (l == 0);
        System.out.println("exit successfully");
    }
}



