package String;
public class stringreverse {
    public static void main(String[] args) {
        String s[] = {"h","e","l","l","o"};
        int i=0, j= s.length-1;
        while(i<j){
            String temp = s[i];
            s[i] = s[j];
            s[j]= temp;
            j--;
            i++;
        }
        for(String st:s){
            System.out.print(st+" ");
        }
    }
}
