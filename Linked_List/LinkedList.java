package Linked_List;

public class LinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    public void addFirst(int data){
        //step1 - Create a newNode
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        //step2 - newNode next = head
        newNode.next = head;

        //step3 - head = newNode
        head = newNode;
    }
    public void addlast(int data){
        //step1 - create a newNode
        Node newNode = new Node(data);
        size++;
        if(head ==null){
            head = tail= newNode;
            return;
        }
        
        //step2 - tail.next = newNode
        tail.next = newNode;
        //step3 - tail = newNode
        tail = newNode;
    }
    public void Add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next =newNode;
    }
    public void subFirst(){
        if(head==tail){
            head = tail = null;
            return;
        }
        head = head.next;
    }
    public void subLast(){
        if(size==1){
            subFirst();
        }
        tail = null;
    }
    public void print(){
        Node temp = head;
        if(head== null){
            System.out.println("");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();

    }
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addlast(3);
        ll.addlast(4); 
        ll.Add(0, 10); 
        ll.print();
        ll.subLast();
        ll.print();
        System.out.println(ll.size);



    
    }
    
}
