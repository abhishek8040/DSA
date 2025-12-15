import java.util.Stack;

public class nextGreaterElement {
    public static void nextGreat(int arr[]){
        Stack<Integer> st = new Stack<>();
        int res[] = new int[arr.length];
        for(int i= arr.length-1; i>=0;i--){
            while(st.size()>0 && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = -1;
            }
            else{
                res[i] = st.peek();
            }
            st.push(arr[i]);

        }
        // print result
        for(int x: res){
            System.out.print(x +" ");
        }

    }
    public static void main(String[] args) {
        
        int arr[] = {6,8,0,1,3};
        nextGreat(arr);
    }
}
