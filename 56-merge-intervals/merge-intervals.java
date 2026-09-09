class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if(n==0) return new int[0][0];
        // sort the array
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0], b[0]));
        // Arraylist that store int arrays as element 
        ArrayList<int[]> ans = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i=1; i<n;i++){
            int currStart = intervals[i][0]; 
            int currEnd =  intervals[i][1];

            // case1: if overlapping
            if(currStart <= end){
                end = Math.max(end, currEnd);
            }
            // case2: if no overlapping
            else{
                ans.add(new int[]{start,end});
                start = currStart;
                end = currEnd;
            }
        }
        // push last merged interval
        ans.add(new int[]{start,end});

        // convert arraylist to 2d array

        return ans.toArray(new int[ans.size()][]);
    
    }
}