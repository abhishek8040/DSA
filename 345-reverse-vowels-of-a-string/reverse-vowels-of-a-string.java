class Solution {
    public String reverseVowels(String s) {
        int l=0,r=s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        List<Character> vowels = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        while(l<r){
            if(vowels.contains(sb.charAt(l)) && vowels.contains(sb.charAt(r))){
                char temp = sb.charAt(l);
                sb.setCharAt(l,sb.charAt(r));
                sb.setCharAt(r,temp);
                l++;
                r--;

            }
            else if(vowels.contains(sb.charAt(l))){
                r--;
            }
            else{
                l++;
            }
        }
        return sb.toString();
    }
}