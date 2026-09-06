class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")|| tokens[i].equals("-")||tokens[i].equals("*") || tokens[i].equals("/")){
                if(tokens[i].equals("+")){
                    int c = st.pop();
                    int ans = c+st.pop();
                    st.push(ans);
                }
                else if(tokens[i].equals("-")){
                    int c = st.pop();
                    int ans = st.pop()-c;
                    st.push(ans);
                }
                else if(tokens[i].equals("*")){
                    int c = st.pop();
                    int ans = c*st.pop();
                    st.push(ans);
                }
                else if(tokens[i].equals("/")){
                    int c = st.pop();
                    int ans = st.pop()/c;
                    st.push(ans);
                }

            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}