import java.util.Scanner;

public class matrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int arr1[][] = new int[x][y];
        int arr2[][] = new int[x][y];
        int ans[][] = new int[x][y];

        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                ans[i][j]= arr1[i][j] + arr2[i][j];
            }
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(ans[i][j]+" ");            
            }
            System.out.println();
        }
        sc.close();

    }
}
