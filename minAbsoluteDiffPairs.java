import java.util.*;
public class minAbsoluteDiffPairs {
    public static void main(String[] args) {
        int arr1[]= {4,1,8,7};
        int arr2[]= {2,3,6,5};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int min = 0, n = arr1.length;
        for(int i=0;i<n;i++){
            min += Math.abs(arr1[i]-arr2[i]);
        }
        System.out.println("Minimum Absolute Difference is: "+min);
    }
}
