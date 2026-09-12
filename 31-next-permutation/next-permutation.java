class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length, pivot=0, left =n-2, right= n-1; boolean flag=false;
        while(left>=0 && right >=0){
            if(nums[left]<nums[right]){
                pivot = left;
                flag= true;
                break;
            }
            else{
                left--;
                right--;
            }
        }
        if(flag == false) {
            reverse(nums,0,n-1);
        }
        else{
            int i=n-1;
            while(i>=pivot){
                if(nums[i]>nums[pivot]){
                    int temp = nums[pivot];
                    nums[pivot]= nums[i];
                    nums[i]=temp;
                    break;
                }
                i--;
                
            }
            reverse(nums,pivot+1,n-1);
        }
    }
    private void reverse(int[] arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++; end--;
        }
    }
}