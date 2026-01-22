import java.util.Stack;

public class validParenthesis {
    public static boolean isvalidParenthesis(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                char top = st.pop();
                if((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')){
                        return false;
                    }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s1 = "(){}[]";
        String s2 = "({}[])";
        String s3 = "((){}[]";
        System.out.println(isvalidParenthesis(s1));
        System.out.println(isvalidParenthesis(s2));
        System.out.println(isvalidParenthesis(s3));
    }
}

