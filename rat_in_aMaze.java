public class rat_in_aMaze {
    ////-----------------------------------------------------------------------//
    // // when only two direction is allowed : down and right
    ////-----------------------------------------------------------------------//
    // public static void main(String[] args) {
    //     int sr=1, er = 3;       // starting row = 1. // ending row(total row) = 3
    //     int sc = 1, ec = 3;     // starting col = 1. // ending col(total col) = 3
    //     int count = maze(sr,sc,er,ec);
    //     System.out.println("Total ways: "+count);
    //     System.out.println("Total Paths are:");
    //     path(sr, sc, er, ec,"");
    // }
    // private static int maze(int sr, int sc, int er, int ec){
    //     if(sr>er || sc>ec) return 0;
    //     if(sr==er && sc==ec) return 1;
    //     int downways = maze(sr+1, sc, er, ec);
    //     int rightways = maze(sr, sc+1, er, ec);
    //     int totalways = downways + rightways;
    //     return totalways;
    // }
    // private static void path(int sr, int sc, int er, int ec, String s){
    //     if(sr>er || sc>ec) return;
    //     if(sr==er && sc==ec){
    //         System.out.println(s);
    //         return;
    //     }
    //     // go down
    //     path(sr+1, sc, er, ec, s+"D");
    //     // go right
    //     path(sr, sc+1, er, ec, s+"R");
    // }

    ////-----------------------------------------------------------------------//
    
    // //   when movement in all 4 directions is allowed

    ////-----------------------------------------------------------------------//

    // public static void main(String[] args) {
    //     int rows= 3;
    //     int cols= 3;

    //     boolean isVisited[][] = new boolean[rows][cols];

    //     System.out.println("All Possible paths are: ");
    //     path(0,0,rows-1,cols-1,"",isVisited);

    // }
    // private static void path(int sr, int sc, int er, int ec, String s, boolean isVisited[][]){
    //     if(sr<0 || sc <0) return;
    //     if(sr>er || sc>ec) return;
    //     if(isVisited[sr][sc]== true) return;
    //     if(sr==er && sc==ec){
    //         System.out.println(s);
    //         return;
    //     }
    //     // mark visited
    //     isVisited[sr][sc]= true;
    //     // go right
    //     path(sr, sc+1, er, ec, s+"R", isVisited);
    //     // go down
    //     path(sr+1, sc, er, ec, s+"D", isVisited);
    //     // go left
    //     path(sr, sc-1, er, ec, s+"L", isVisited);
    //     //go up
    //     path(sr-1, sc, er, ec, s+"U", isVisited);

    //     //backtracking

    //     isVisited[sr][sc] = false;
    // }

    //-----------------------------------------------------------------------//
    //      Restrictions in maze (can not visit some boxes)
    //-----------------------------------------------------------------------//


    public static void pathofRestrictedMaze(int sr,int sc, int er, int ec , String s,int maze[][]){
        if(sr<0 || sc<0) return;
        if(sr>er || sc > ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc] == 0) return;  // Blocked or Restricted path
        if(maze[sr][sc] == -1) return;  // this was already visited
        // check
        maze[sr][sc] = -1;

        // Go Right
        pathofRestrictedMaze(sr, sc+1, er, ec, s+"R", maze);

        // Go Down
        pathofRestrictedMaze(sr+1, sc, er, ec, s+"D", maze);
        // Go Left 
        pathofRestrictedMaze(sr, sc-1, er, ec, s+"L", maze);
        // Go Up
        pathofRestrictedMaze(sr-1, sc, er, ec, s+"U", maze);

        // backtracking
        maze[sr][sc] = 1;
    }

    public static void main(String[] args) {
        int rows= 3, cols = 4;
        int maze[][] = {{1,0,1,1},
                        {1,1,1,1},
                        {1,1,0,1}

                        };
        pathofRestrictedMaze(0,0, rows-1, cols-1,"", maze);

    }



}
