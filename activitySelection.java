
import java.util.*;
public class activitySelection {

    public static void maxActivity(int start[], int end[]){
        int maxactivity=1; // let maximum 1 activity possible
        int n = end.length;
        int mat[][]= new int[n][3];
        for(int i=0;i<n;i++){
            mat[i][0]= i;
            mat[i][1] = start[i];
            mat[i][2] = end[i];
        }
        Arrays.sort(mat,Comparator.comparingDouble(o -> o[2]));
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(mat[0][0]);
        int prevend = mat[0][2];
        for(int i=1;i<n;i++){
            if(mat[i][1] >= prevend){
                maxactivity++;
                ans.add(mat[i][0]);
                prevend = end[i];
            }
        }
        System.out.println("Maximum Activities: "+ maxactivity);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }

    }
    public static void main(String[] args) {
        int start[]= {1,3,0,5,8,5};
        int end[]= {2,4,6,7,9,9};
        maxActivity(start,end);
    }
}
