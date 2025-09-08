public class mergeSortCode {
    public static void mergeSort(int arr[], int s, int e){
        if(s >= e) {
            return;
        }
        int mid = s + (e - s)/2;
        mergeSort(arr, s, mid);         // left part
        mergeSort(arr, mid+1, e);       // right part
        merge(arr, s, mid, e);          // merge sorted parts
    }
    public static void merge(int arr[], int s, int mid, int e){
        int temp[] = new int[e-s+1];
        int i = s , j = mid+1;
        int k =0;
        while(i<=mid && j<= e){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++; 
                k++;
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        // if some left part remaining
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        // if some right part remaining
        while(j<=e){
            temp[k++] = arr[j++];
        }

        // copy temp arr to original arr
        for(k=0, i=s; k<temp.length;k++, i++){
            arr[i] = temp[k];
        }

    }
    // to print array
    public static void printArr(int arr[]){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {4,8,1,6,2,7,0,-3};
        System.out.println("Original Array");
        printArr(arr);

        mergeSort(arr, 0, arr.length-1);
        System.out.println("Sorted Array");
        printArr(arr);
    }
}
