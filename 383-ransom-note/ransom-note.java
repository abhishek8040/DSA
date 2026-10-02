class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int hash[]= new int[256];
        for(int i=0;i<ransomNote.length();i++){
            hash[ransomNote.charAt(i)]++;
        }
        for(int j=0;j<magazine.length();j++){
            hash[magazine.charAt(j)]--;
        }
        for(int k=0;k<hash.length;k++){
            if(hash[k]>0) return false;
        }
        return true;
    }
}