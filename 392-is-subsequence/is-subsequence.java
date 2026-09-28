class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        if(s.length()>t.length()) return false;
        if(s.length()==0) return true;
        while(i<t.length()){
            if(t.charAt(i)==s.charAt(j)){
                i++;
                j++;
            }
            else if(t.charAt(i)!=s.charAt(j)){
                i++;
            }
            if(j==s.length()) return true;
        }
        return false;
    }
}