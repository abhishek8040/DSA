package Array;
import java.util.*;
public class SecondLargest {
    public static void secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest distinct element");
        } else {
            System.out.println(second);
        }
    }
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        secondLargest(arr);
        sc.close();
    }
    
}
