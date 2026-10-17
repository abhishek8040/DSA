class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0; int j=0;
        for(int i=0;i<words.length;i++){
                while(words[i].length()>= pref.length() && j<pref.length() && words[i].charAt(j)==pref.charAt(j)){
                    j++;
                }
                if(j==pref.length()){
                    count++;
                    
                }
                j=0;
            
        }
        return count;
    }
}