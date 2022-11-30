//CIRCULAR DOUBLY LINKED LIST
class CircularLinkedList
{
    class Node
    {
        int data;
        Node next; //Node: reference type , next/prev: reference variables (stores an address of an object of type Node)
        Node prev;
    }

   Node head = null; //store the address of first node   //null is assigned always in lower case in java
   Node tail = null; // stores address of last node
   void append(int data)
   {
    Node newNode = new Node(); //create a new node
    newNode.data = data; //store the data of new node
    if(head == null) //check if linked list is empty
    {
        head = newNode;
        tail = head;
    }
    else
    {
        tail.next = newNode; //tail's next is new node
        newNode.prev = tail; // new node's prev is tail
        newNode.next = head; //new node's next is head
        head.prev = newNode; //head's prev is new node
        tail = newNode; //tail is new node
    }
   }

   void print()
   {
    System.out.println(head.data); //print first node
    Node temp = head.next; //make temp = head ka next 
    while(temp!=head) // print as long as temp doesn't reach head
    {
        System.out.println(temp.data+" ");
        temp = temp.next;
    }
   }
}



class circular_ll
{
    public static void main(String[] args) {
        CircularLinkedList myList1 = new CircularLinkedList();
        myList1.append(5);
        myList1.append(6);
        myList1.append(7);
        myList1.append(8);
        myList1.append(9);
        myList1.append(10);
        myList1.print();

        CircularLinkedList myList2 = new CircularLinkedList();
        myList2.append(8);
        myList2.append(9);
        myList2.append(10);
        myList2.append(5);
        myList2.append(6);
        myList2.append(7);
    }
}