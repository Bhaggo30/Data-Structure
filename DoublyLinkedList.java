public class DoublyLinkedList {

    class Node{
        int data;
        Node next;
        Node previous;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
    public Node head;
    public Node tail;

    public void addNode(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;

            head.previous = null;
            tail.next = null;
        }
        else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next =head;
            head.previous = newNode;
            head = newNode;
        }
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
    }
    public void insertAtPosition(int data,int position){
       Node newNode = new Node (data);
       if (position ==0){
           addFirst(data);
           return;
       }
       Node currentNode = head;
       for (int i =0; i<position-1; i++){
           if (currentNode == null){
               System.out.println("position is not present ");
               return;
           }
           currentNode = currentNode.next;
       }
       newNode.next = currentNode.next;
       if (currentNode.next !=null){
           currentNode.previous = newNode;

        }
       currentNode.next = newNode;
       newNode.previous = currentNode;
       if (newNode.next == null){
           tail = newNode;
       }
    }
    public void deleteFirst(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        if (head == tail){
            head = null;
            tail = null;

        }
        else{
            head = head.next;
            head.previous = null;
        }
    }
    public void deleteLast(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        if (head == tail){
            head = null;
            tail = null;

        }
        else {
            tail = tail.previous;
            tail.next = null;
        }
    }
    public void display(){
        if (head == null){
            System.out.println("list is empty ");
            return;
        }
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data+ " ->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dList = new DoublyLinkedList();
        dList.addNode(10);
        dList.addNode(20);
        dList.addNode(30);
        dList.display();

        dList.addFirst(5);
        dList.addFirst(10);
        dList.display();

        dList.addLast(90);
        dList.addLast(80);
        dList.display();

        dList.insertAtPosition(50,5);
        dList.display();

        dList.deleteFirst();
        dList.display();

        dList.deleteLast();
        dList.display();
    }
}
