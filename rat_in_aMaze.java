public class rat_in_aMaze {
    public static void main(String[] args) {
        int sr=1, er = 3;       // starting row = 1. // ending row(total row) = 3
        int sc = 1, ec = 3;     // starting col = 1. // ending col(total col) = 3
        int count = maze(sr,sc,er,ec);
        System.out.println("Total ways: "+count);
    }
    private static int maze(int sr, int sc, int er, int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc==ec) return 1;
        int downways = maze(sr+1, sc, er, ec);
        int rightways = maze(sr, sc+1, er, ec);
        int totalways = downways + rightways;
        return totalways;
    }
    
}
