public class leetcode27 {
    public static void main(String[] args) {
        // remove given element 
        int nums[] = {0,1,2,2,3,0,4,2};
        int val = 2;
        int k=0, n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(k);
        for (int i = 0; i <= k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
