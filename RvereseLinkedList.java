public class RvereseLinkedList {
//input  1------>2------>3------>4------>null
//target 4------>3------>2------>1------>null
    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.print();
        System.out.println();
     a.head= a.reverse(a); //making the head ref of linky  to point at the last node of previous linkedlist before reversal
     System.out.println();
     System.out.println("AFTER REVERSING");  
     System.out.println(); 
     a.print();
    }

}

class LinkedList {
    Node head;// points to series of nodes
    int length;// length of linkedList

    // inner node class
    class Node {
        int data; // data to be inserted
        Node next; // may point at null or next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // to insert element in to the LinkedList
    public void push(int data) {
        Node newnode = new Node(data); // creation of new node with instance variable data=entered int data and
                                       // next=null
        length++;
        if (head == null) {
            head = newnode;

        } else {
            Node iterator = head;
            while (iterator.next != null) {
                iterator = iterator.next; // to go to the nextnode

            }
            iterator.next = newnode; // making the last node to point at the new node

        }

    }

    // to print the elements of the LinkedList
    public void print() {
        Node iterator = null;
        if (head == null) { // if linkedList is empty
            System.out.println("no elements");
        } else { // not empty
            iterator = head;

            while (iterator != null) {
                System.out.print(iterator.data + "------>");
                iterator = iterator.next;

            }
            System.out.print("null");
        }
    }

    public Node reverse(LinkedList a) {
       Node current=head;      //current node points whatever head is pointing at
       Node previous=null;
       Node next=null;
       if(head ==null){
           return head;    // if list is empty
       }
       else{
       while(current!=null){     //until current node points to null 
           next=current.next;       //next pointer will point at the node that is next to the node that is being pointed by the current pointer
           current.next=previous;  // current.next will no more point to the nexxt node rather it points whatever previous pointer is pointing at
           previous=current;      //now previous pointer will point to whatever node current pointer is pointing at
           current =next;        // now we have to go the next node so current pointer ll be made to point at whatever node the next node is pointing
        
        }
    
       return previous;     // this will be the new head that is the last node of the linkedList before reversing it 

    }
}
}