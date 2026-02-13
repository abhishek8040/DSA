public class QueueUsingLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        Node head = null;
        Node tail = null;

        public boolean isEmpty(){
            return head==null;
        }
        public void add(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            int deleted = head.data;
            if(head==tail){
                head=tail = null;
            
            }
            else{
                head = head.next;
            }
            return deleted;
        }
        public int peek(){
            if(isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            return head.data;
        }
        public void printQueue(){
            Node ptr = head;
            while(ptr !=null){
                System.out.print(ptr.data+"->");
                ptr = ptr.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.add(4);

        q.printQueue();
        System.out.println(q.peek());
    }
}
