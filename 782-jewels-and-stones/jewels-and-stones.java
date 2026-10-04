class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> mp = new HashMap<>();
        int count=0;
        for(int i=0;i<stones.length();i++){
            mp.put(stones.charAt(i),mp.getOrDefault(stones.charAt(i),0)+1);
        }
        for(int j=0;j<jewels.length();j++){
            count+= mp.getOrDefault(jewels.charAt(j),0);
        }
        return count;
    }
}