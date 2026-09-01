package array;
import java.util.HashSet;

public class UnionOfTwoSortedArrays {
public static void unionof(int arr1[], int arr2[]){
    int i=0;
    int j=0;
    int k=0;
    int union[]=new int[(arr1.length + arr2.length)];
    while(i<arr1.length && j<arr2.length){
        if(arr1[i]<arr2[j] ){
            if(k == 0 || union[k-1] != arr1[i]){
            union[k]=arr1[i];
             k++;
            }
           
            i++;
        }else if(arr1[i]==arr2[j]){
            if(k == 0 || union[k-1] != arr2[j]){
         union[k]=arr1[i];
         k++;
            }
         i++;
         j++;
        }else if(arr1[i]>arr2[j]){
               if(k == 0 || union[k-1] != arr2[j]){
            union[k]=arr2[j];
            k++;
               }
            j++;
        }
    }
    while(i<arr1.length){
          if(k == 0 || union[k-1] != arr1[i]){
        union[k]=arr1[i];
       
        k++;
          }
           i++;
    }
    while(j<arr2.length){
          if(k == 0 || union[k-1] != arr2[j]){
        union[k]=arr2[j];
      
        k++;
          } 
           j++;
    }
   
    for(int idx=0;idx<k;idx++){
        System.out.print(union[idx]+"  ");
    }
}
    public static void main(String[] args) {
        int arr1[]={1,1,1,4,5};
        int arr2[]={2,3,4,4,5};
        unionof(arr1, arr2);
        
    }
}
