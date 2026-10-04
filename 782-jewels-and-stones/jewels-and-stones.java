class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int freq[]= new int[256];
        int count=0;
        for(int i=0;i<stones.length();i++){
            freq[stones.charAt(i)]++;
        }
        for(int j=0;j<jewels.length();j++){
            count += freq[jewels.charAt(j)];
        }
        return count;
    }
}