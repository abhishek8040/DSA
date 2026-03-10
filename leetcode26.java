public class leetcode26 {
    public static void main(String[] args) {
        // leetcode remove duplicates  26////  27, 88, 136, 268, 724, 28, 58, 344, 387 .... / -28,
        int nums[]= {0,0,1,1,1,2,2,-1,3,3,4};
        int n = nums.length;
        int k = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        System.out.println(k + 1);

        for (int i = 0; i <= k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
