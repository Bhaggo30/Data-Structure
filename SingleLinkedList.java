public class SingleLinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    public Node head;
    public Node tail;

    public void addNode(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
            }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void  display(){
        Node currentNode = head;
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        while (currentNode != null){
            System.out.print(currentNode.data+ " ->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else{

            newNode.next = head;
            head = newNode;
        }
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void addSpecifiedPosition(int data,int position){
     Node newNode = new Node(data);
     if (position ==0){
         addFirst(data);
         return;
     }
     Node currentNode = head;
     for (int i =0; i<position-1; i++){
         if (currentNode == null){
             System.out.println("position is not present");
             return;
         }
         currentNode = currentNode.next;

     }
     newNode.next = currentNode.next;
     currentNode.next = newNode;
     if (newNode.next == null){
         tail = newNode;
     }
    }
    public void  deleteFirst(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        if (head == null){
            tail = null;
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
            return;
        }
        Node currentNode = head;
        while (currentNode.next != tail){
            currentNode = currentNode.next;
        }
        currentNode.next = tail;
        tail = currentNode;
    }
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addFirst(0);
        list.display();

        list.addLast(9);
        list.addLast(8);
        list.display();

        list.addSpecifiedPosition(5,5);
        list.addSpecifiedPosition(4,6);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

    }
}
