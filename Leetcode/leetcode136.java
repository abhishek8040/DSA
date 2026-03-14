package Leetcode;
public class leetcode136 {
    public static void main(String[] args) {
    // every number is repeated except one... return that unique number 
    int nums[] = {4,1,2,1,2};
    int ans =nums[0];
    for(int i=1;i<nums.length;i++){
        ans = ans^nums[i];
    }
    System.out.println("Unique element is: "+ans);

    }
}
