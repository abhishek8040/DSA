/// Advantage: Removes element in O(1)
public class circularQueueUsingArray {
    static class Queue {
        int arr[];
        int size;
        int front, rear;
        
        Queue(int n){
            size = n;
            arr = new int[size];
            front = -1;
            rear = -1;
        }
        public  boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public boolean isFull(){
            return (rear+1)%size == front;
        }

        public void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            /// when adding first element
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public  int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int deleted = arr[front];
            // if there is only one element in queue
            if(front == rear){
                front = rear = -1;
            }
            else{
                front = (front+1) % size;
            }
            return deleted;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q1 = new Queue(3);
        Queue q2 = new Queue(4);
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q2.add(4);
        q2.add(5);
        q2.add(6);
        q2.add(7);

        System.out.println("Queue  1 after performing remove oprtn is:");
        while(!q1.isEmpty()){
            System.out.print(q1.peek()+" ");
            q1.remove();
        }
        System.out.println("\nQueue  2 after performing remove oprtn is:");
        while(!q2.isEmpty()){
            System.out.print(q2.peek()+" ");
            q2.remove();
        }
        System.out.println();
        System.out.println("rear of q1 is "+q1.rear);
    }
}
