import java.util.Stack;

public class StackClass {
    int maxSize;
    int top;
    int [] stackArray;

    public StackClass(int maxSize) {
        this.maxSize = maxSize;
        this.top =-1;
        this.stackArray = new int[maxSize];

    }
    public void push(int value){
        if (top >= maxSize-1){
            System.out.println("stack is full "+value+ "we are not value on stack");
        }
        else {
            stackArray[++top] = value;

        }
    }
    public int pop(){
        if (top <0){
            System.out.println("stack is empty");
            return -1;
        }
        else{
            return stackArray[top--];

        }
    }
    public int peek(){
        if (top <0){
            System.out.println("satck is empty");
        }
        else {
            return stackArray[top];
        }
        return -1;
    }
    public boolean isEmpty(){
        return (top == -1);

    }
    public boolean isFull(){
        return (top == maxSize-1);
    }
    public int size(){
        return  top+1;
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Size of stack: " + stack.size());
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Size of stack: " + stack.size());
    }

}
