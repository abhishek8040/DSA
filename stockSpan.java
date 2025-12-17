import java.util.Stack;
public class stockSpan {
    public static void span(int arr[]){
        Stack<Integer> st = new Stack<>();
        int res[] = new int[arr.length];
        
        for(int i=0 ; i<res.length; i++){
            while(st.size() >0 && arr[i] >= arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()) {res[i] = i+1;}
            else{ res[i] = i- st.peek();}
            st.push(i);
        }
        for(int x: res){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {100,80,60,70,60,75,85};
        span(arr);
    }
}
