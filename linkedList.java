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
    public linkedList(){
        this.head = null;
    }

    // Insert at beginning

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    // Delete a node with given data

    public void delete(int data){
        if(head == null) return;

        if(head.data == data){
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if(current.next != null){
            current.next = current.next.next;
        }


    }

    // Display the linkedlist
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

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
    }


}
