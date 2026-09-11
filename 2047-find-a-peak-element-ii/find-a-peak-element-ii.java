class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int start=0, end = n-1;
        while(start<=end){
            int mid= (start+end)/2;
            int row = MaxEl(mat,mid);
            int left = mid-1>=0? mat[row][mid-1] : -1;
            int right = mid+1<n? mat[row][mid+1] : -1;

            if(mat[row][mid]>left && mat[row][mid]>right){
                return new int[]{row,mid};
            }
            else if(left>mat[row][mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return new int[]{-1,-1};

    }
    private int MaxEl(int[][] mat, int col){
        int n = mat.length, max=Integer.MIN_VALUE, index=-1;
        for(int i=0;i<n;i++){
            if(mat[i][col]>max){
                max = mat[i][col];
                index=i;
            }
        }
        return index;
    }
}