public class leetcode28 {
    // 28. Find the Index of the First Occurrence in a String
    public static void main(String[] args) {
        String s1 = "helloworldhello";
        String s2 = "world";

        if(s1.length()<s2.length()) System.out.println(-1);
        for(int i=0;i<s1.length();i++){
            int j=0;
            while(j< s2.length() && (i+j)<s1.length()){
                if(s1.charAt(i+j) != s2.charAt(j)){
                    break;
                }
                else{
                    j++;
                }

                if(j==s2.length()){
                    System.out.println(i);
                    break;
                }

            }
        }
        

    }
}
