package array;
import java.util.ArrayList;
import java.util.List;

public class PascleTriangle {
    // Find a specific element in Pascal Triangle
    public static int findPascalElement(int r,int c){
        int row=r-1;
        int col=c-1;
        int result=1;
        for(int i=0;i<col;i++){
         result=result*(row-i);
         result=result/(i+1);
        }
        return result;
    }
    // Generate a single row of Pascal Triangle (Optimal)
    public static List<Integer> generateRow(int rowIndex){
       List<Integer> row=new ArrayList<>();
       long ans=1;
       row.add((int)ans);
       for(int i=1;i<=rowIndex;i++){
        ans=ans*(rowIndex-i+1);
        ans=ans/i;
        row.add((int)ans);
    }
    return row;
    }
    // Generate complete Pascal Triangle
public static List<List<Integer>> generatePascalTriangle(int r){
    List<List<Integer>> result=new ArrayList<>();
    for(int i=0;i<r;i++){
     result.add(generateRow(i));
    }
    return result;
}

    public static void main(String[] args) {
      System.out.println(generatePascalTriangle(2));
    }
}
