class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    private Node head;
    private Node tail;

    LinkedList(){
        this.head = null;
        this.tail = null;
    }
    
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            newNode.next = this.head;
            this.head = newNode;
        }
    }
    
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    public void deleteFromBeginning(){
        if(head != null){}
        head = head.next;
    }

    public void deleteFromEnd(){
        if(head == null || head.next == null){
            head = null;
            tail = null;
            return;
        }
        Node tmp = head;
        while(tmp.next.next != null){
            tmp = tmp.next;
        }
        tmp.next = null;
        tail = tmp;
    }

    public void traverse(){
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public boolean search(int key){
        Node tmp = head;
        while(tmp != null){
            if(tmp.data == key){
            return true;
            }
            tmp = tmp.next;
        }
            return false;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        list.insertAtEnd(40);

        list.traverse();

        list.deleteFromBeginning();
        list.deleteFromEnd();
        
        list.traverse();

        System.out.println(list.search(20));
    }
}