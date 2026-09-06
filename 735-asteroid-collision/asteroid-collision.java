class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;
        for(int i=n-1;i>=0;i--){
            int curr = asteroids[i];
            boolean alive = true;
            while(!st.isEmpty() && st.peek()<0 && curr>0){
                if(Math.abs(curr)>Math.abs(st.peek())){
                    st.pop();
                }
                else if(Math.abs(curr)<Math.abs(st.peek())){
                    alive = false;
                    break;
                }
                else{
                    alive = false;
                    st.pop();
                    break;
                }
            }

            
            if(alive== true)st.push(curr);
        }
        int ans[]= new int[st.size()];
        for(int j=0;j<ans.length;j++){
            ans[j] = st.pop();
        }
        return ans;
    }
}