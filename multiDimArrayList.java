import java.util.ArrayList;

public class multiDimArrayList {
    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> mainList = new ArrayList<>(); 
        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);
        lst1.add(5);
        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(6);
        lst2.add(7);
        lst2.add(8);
        lst2.add(9);
        lst2.add(10);
        ArrayList<Integer> lst3 = new ArrayList<>();
        lst3.add(31);
        lst3.add(15);
        lst3.add(30);
        lst3.add(20);
        lst3.add(10);

        mainList.add(lst1);
        mainList.add(lst2);
        mainList.add(lst3);

        System.out.println(mainList);
        
        for(int i=0; i<mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
    
}
