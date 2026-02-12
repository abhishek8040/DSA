// Queue Using Array ---- 
// Disadvantages: fixed size, in removing element O(n)

public class QueueUsingArray{
    static class Queue {
        int arr[];
        int size;
        int rear;
        
        Queue(int n){
            size = n;
            arr = new int[size];
            rear = -1;
        }
        public  boolean isEmpty(){
            return rear == -1;
        }
        public void add(int data){
            if(rear == size-1){
                System.out.println("Queue is Full");
                return;
            }
            rear += 1;
            arr[rear] = data;
        }
        public  int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear -= 1;
            return front;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return arr[0];
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