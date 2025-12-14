import java.util.Stack;

public class reverse_string_using_stack {
    public static void reverseString(String s){
        Stack<Character> st = new Stack<>();
        int i=0;
        while(i<s.length()){
            st.push(s.charAt(i));
            i++;
        }
        StringBuilder res = new StringBuilder();

        while(!st.isEmpty()){
            res.append(st.pop());
        }
        System.out.println(res.toString());
    }
    public static void main(String[] args) {
        reverseString("Abhishek");
    }
}
