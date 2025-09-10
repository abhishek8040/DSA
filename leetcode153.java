public class leetcode153 {
    public static int minOfRotatedSortedArray(int arr[]){
        int n = arr.length;
        int start =0, end = n-1;
        if(n==1) return arr[0];
        while(start < end){
            int mid = start + (end-start)/2; 
            if(arr[mid]> arr[end]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return arr[start];
    }

    public static void main(String[] args) {
        int arr1[] = {2,4,6,8,10,0,1};
        int arr2[] = {0,1,0};
        int arr3[] = {9,10,5,6,7};
        int arr4[] = {5,6,7,8,1,2}; 
        int peak1 =minOfRotatedSortedArray(arr1);
        System.out.println(peak1);
        int peak2 = minOfRotatedSortedArray(arr2);
        System.out.println(peak2);
        int peak3 = minOfRotatedSortedArray(arr3);
        System.out.println(peak3);
        int peak4 = minOfRotatedSortedArray(arr4);
        System.out.println(peak4);
    }
}
