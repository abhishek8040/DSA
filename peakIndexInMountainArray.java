public class peakIndexInMountainArray {
    // public static int peakIndexInMountainArr(int[] arr) {
    //     int start = 0, end = arr.length-1;
    //     while(start < end){
    //         int mid = start + (end-start)/2;
    //         // Right 
    //         if(arr[mid] < arr[mid+1]) {
    //             start = mid+1;
    //         }
    //         // Left
    //         else {
    //             end = mid;
    //         }
            
    //     }
    //     return start; // or return end
    // }
    public static int peakIndexInMountainArr(int[] arr) {
        int n = arr.length, start = 1, end = n-2;
        if(n == 1) return 0;   // if array contains only one element
        if(arr[0] > arr[1]) return 0;  // peak at index 0
        if(arr[n-1] > arr[n-2]) return n-1; // peak at last index
        while(start <= end){
            int mid = (start + end)/2;
            // peak condition
            if(arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]){
                return mid;
            }
             // if still rising → go right

            else if(arr[mid-1] < arr[mid]) {
                start = mid+1;
            }
            // otherwise → go left

            else{
                end = mid-1;
            }
        }
        return -1;
    }

    // test cases
    public static void main(String[] args) {
        int arr1[] = {2,4,6,8,10,8,5};
        int arr2[] = {0,1,0};
        int arr3[] = {0,10,5,2};
        int arr4[] = {5,6,7,8,1,3,2}; 
        int peak1 =peakIndexInMountainArr(arr1);
        System.out.println(peak1);
        int peak2 = peakIndexInMountainArr(arr2);
        System.out.println(peak2);
        int peak3 = peakIndexInMountainArr(arr3);
        System.out.println(peak3);
        int peak4 = peakIndexInMountainArr(arr4);
        System.out.println(peak4);
    }
}
