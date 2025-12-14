public class linkedList {

    // Node Class to represent individual elements
    class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // initialize empty linkedlist
    private Node head;
    private Node tail; // added

    public linkedList(){
        this.head = null;
        this.tail = null; // added
    }

    // Insert at beginning
    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if (tail == null) tail = newNode; // handle first insert
    }

    // Insert at end (now O(1))
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode; // handle empty list
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Delete a node with given data
    public void delete(int data){
        if(head == null) return;

        if(head.data == data){
            head = head.next;
            if (head == null) tail = null; // list became empty
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if(current.next != null){
            if (current.next == tail) { // deleting last node
                tail = current;
            }
            current.next = current.next.next;
        }


    }
    public void inserAtindex(int index, int data){
        if(index == 0){
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head; int count =0;
        while(count != index-1){
            current = current.next;
            count++;
        }
        newNode.next = current.next;
        current.next = newNode;
        
    }
    
    //---------------// search element in linkedlist using recursion--------------
    
    public int findHelper(Node head, int key){
        if(head == null){
            return -1;
        }
        else if(head.data == key){
            return 0;
        }
        int idx = findHelper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int findElementRecursive(int key){
        return findHelper(head, key);
    }

    // -------------------------------///-----------/-//-----------/


    // Display the linkedlist

    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
// -------------------------------///-----------/-//-----------/


    public static void main(String[] args) {
        linkedList lst = new linkedList();
        // insert elements
        lst.insertAtBeginning(1);
        lst.insertAtBeginning(2);
        lst.insertAtBeginning(3);
        lst.insertAtBeginning(7);
        lst.insertAtEnd(4);
        lst.insertAtEnd(5);
        lst.insertAtEnd(6);

        // display ll
        System.out.println("Linked List : ");
        lst.display();

        // delete an element

        lst.delete(2);
        lst.delete(7);
        System.out.println("\nLinked List after delition of 2 nd 7: ");
        lst.display();
        lst.inserAtindex(2, 13);
        System.out.println("\nLinked List after inserting 13 at index 2: ");
        lst.display();
        System.out.println("Index of 4 in LL is: ");  // return the index of 4
        System.out.println(lst.findElementRecursive(4));
        System.out.println(lst.findElementRecursive(10));

    }


}
