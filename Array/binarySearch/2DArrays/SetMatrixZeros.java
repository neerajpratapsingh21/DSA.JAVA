
public class SetMatrixZeros {
   // Marks all non-zero elements of a row as -1
    public static void markRow(int matrix[][],int i){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]!=0){
            matrix[i][j]=-1;
            }
        }
}
// Marks all non-zero elements of a column as -1
 public static void markColumn(int matrix[][],int j){
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][j]!=0){
            matrix[i][j]=-1;
            }
        }
}
// brute force approach 
//Time Complexity: O(m * n * (m + n))
public static void bruteForce(int matrix[][]){
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==0){
                markRow(matrix, i);
                markColumn(matrix, j);
            }
        }
    }
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==-1){
               matrix[i][j]=0;
            }
        }
    }

}
// Better solution using extra space
//Time  : O(m × n)
//Space : O(m + n)
public static void betterSolution(int matrix[][]){
    int n=matrix.length;
    int m=matrix[0].length;
    int row[]=new int[n];
    int col[]=new int[m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(matrix[i][j]==0){
              row[i]=1;
              col[j]=1;
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
           if(row[i]==1 || col[j]==1){
             matrix[i][j]=0;
           }
        }
    }
    
}
// Optimal Solution in place
//Time  : O(m × n)
//Space : O(1)
public static void optimalSolution(int matrix[][]){
     // Get dimensions of matrix
    int n=matrix.length;
    int m=matrix[0].length;
    // Flag to track if  first row should be zero
    boolean isFirstRowHasZero=false;
    //Flag to track if  first column should be zero
    boolean isFirstColHasZero=false;

    // check if first row has any zero
    for(int j=0;j<m;j++){
        if(matrix[0][j]==0){
            isFirstRowHasZero=true;
        }
    }
     // check if first col has any zero
    for(int i=0;i<n;i++){
        if(matrix[i][0]==0){
            isFirstColHasZero=true;
        }
    }
// Use first row/column as markers
for(int i=1;i<n;i++){
    for(int j=1;j<m;j++){
        if(matrix[i][j]==0){
            matrix[0][j]=0;
            matrix[i][0]=0;
        }
    }
}
// Set zero based on markers
for(int i=1;i<n;i++){
    for(int j=1;j<m;j++){
        if(matrix[i][0]==0 || matrix[0][j]==0){
            matrix[i][j]=0;
        }
    }
}
// Zero first row if needed
if(isFirstRowHasZero){
     for(int j=0;j<m;j++){
        matrix[0][j]=0;
    }
}
// Zero first col if needed
if(isFirstColHasZero){
     for(int i=0;i<n;i++){
        matrix[i][0]=0;
    }
}
}
public static void main(String[] args) {
    int arr[][]={{1,1,1,1},{1,0,1,1},{1,1,0,1},{0,1,1,1}};
    // bruteForce(arr);
   // betterSolution(arr);
   optimalSolution(arr);
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+"   ");
         }
        System.out.println();
     }
    
}
    
}