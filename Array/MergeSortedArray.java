package array;
public class MergeSortedArray {
    public static void mergeUsingTemp(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
       int temp[]=new int[n+m]; 
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                temp[k++]=nums1[i];
                i++;
            }else{
               temp[k++]=nums2[j];
               j++;
               }
              
        }
         while(i<m){
               temp[k++]=nums1[i];
               i++;
               }
               while(j<n){
                temp[k++]=nums2[j];
                j++;
               }
               for(int l=0;l<(m+n);l++){
                nums1[l]=temp[l];
               }


    }
    public static void mergeOptimal(int nums1[],int m,int nums2[],int n){
        int i=m-1;
        int j=n-1;
        int k=(n+m)-1;
        while(i>=0 && j>=0){
            if(nums1[i]<nums2[j]){
                nums1[k]=nums2[j];
                k--;
                j--;
            }else{
                nums1[k]=nums1[i];
                k--;
                i--;
            }
        }
        while(j>=0){
             nums1[k]=nums2[j];
                k--;
                j--;
        }
    }
    public static void main(String[] args) {
        int num1[]={1,2,3,0,0,0};
        int num2[]={1,2,3};
        mergeOptimal(num1, 3, num2, 3);
        for(int i :num1){
            System.out.print(i+"  ");
        }
    }
}
