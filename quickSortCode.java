// Quick Sort code
public class quickSortCode {
    // QuickSort function - array ko sort karta hai
    public static void quickSort(int arr[], int start, int end){
        // Base case: agar ek ya zero element hai toh kuch nahi karna
        if(start >= end) {
            return;
        }
        // Partition karke pivot ki sahi jagah nikalte hain
        int pivot = partition(arr, start, end);
        // Left part ko sort karo
        quickSort(arr, start, pivot-1);
        // Right part ko sort karo
        quickSort(arr, pivot+1, end);
    }
    // Partition function - pivot ko sahi jagah pe rakhta hai
    public static int partition(int arr[], int start, int end){
        int pivot = arr[end]; // Last element ko pivot le rahe hain
        int pos = start;
        for(int i = start; i < end; i++){
            // Agar current element pivot se chhota ya barabar hai toh swap karo
            if(arr[i] <= pivot){
                swap(arr, i, pos);
                pos++;
            }
        }
        // Pivot ko uski sahi jagah pe le aao
        swap(arr, pos, end);
        return pos;
    }
    // Do elements ko swap karne ka function
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // Array print karne ka function
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    // Main function - yahan se program start hota hai
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        System.out.println("Before");
        printArr(arr); // Sorting se pehle array print karo
        quickSort(arr, 0, arr.length-1); // Array ko sort karo
        System.out.println("After");
        printArr(arr); // Sorting ke baad array print karo
    }
}
