import java.util.Scanner;

class Stack {
    int top = -1;
    int n = 3;
    int[] a = new int[n];
    Scanner sc = new Scanner(System.in);

    public void underflow() {
        if (top == (n - 1)) {
            System.out.println("there is no item in the stack");
        }
    }
    public void overflow() {
        if (top == -1) {
            System.out.println("stack is full ");
        }
    }

    public void push(Scanner sc) {
        if (top == (n - 1)) {
            System.out.println("stack overflow");
        } else {
            System.out.println("enter data to be inserted");
            int i = this.sc.nextInt();
            top = top + 1;
            a[top] = i;
            System.out.println("item inserted successfully");
        }
    }

    public void pop(Scanner sc) {
        if (top == -1) {
            System.out.println("stack underflow");
        } else {
            top = top - 1;
            System.out.println("item deleted successfully");
        }
    }

    public void display() {
        System.out.println("inserted items in the satck are :");
        for (int j = top; j >= 0; j--) {
            System.out.println(a[j]);
        }
    }
}

public class StackArray
{
    public static void main(String[] args) {
        int d, l = 0;
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        do {
            System.out.println("1 : press enter to push  ");
            System.out.println("2 : press enter to pop");
            System.out.println("3 : press enter to display");
            System.out.println("4 : press to check overflow condition");
            System.out.println("5 : press to check underflow condition");
            System.out.println("enter your choice");
            d = sc.nextInt();
            switch (d) {
                case 1:
                    s.push(sc);
                    break;
                case 2:
                    s.pop(sc);
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    s.overflow();
                    System.out.println("stack is overflow");
                    break;
                case 5:
                    s.underflow();
                    System.out.println("stack is underflow");
                    break;
                default:
                    System.out.println("enter any key to exit");
                    l = sc.nextInt();
            }
        }
            while (l == 0);
                System.out.println("exit successfully");
            }

        }




