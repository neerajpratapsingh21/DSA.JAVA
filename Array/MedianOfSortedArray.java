package binarysearch;

/**
 * MedianOfSortedArray
 */
public class MedianOfSortedArray {
    public static double findMedianSortedArray(int nums1[],int nums2[],int n1,int n2){
        int temp[]=new int[n1+n2];
        int left=0;
        int right=0;
        int k=0;
        while(left<n1 && right<n2){
            if(nums1[left]<=nums2[right]){
               temp[k++]=nums1[left];
               left++;
            }else{
                temp[k++]=nums2[right];
                right++;
            }
        }
        while(left<n1){
            temp[k++]=nums1[left];
             left++;
        }
        while(right<n2){
            temp[k++]=nums2[right];
            right++;
        }
        k=temp.length;
        
        if(k%2==1){
            return (double) temp[k/2];
        }
        int sumOfMedain=0;
          sumOfMedain = temp[k/2] + temp[(k/2)-1];
          return (double) sumOfMedain/2;
        
    }
      public static double betterSolution(int nums1[],int nums2[]){
        int left=0;
        int right=0;
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        int ind2=n/2;
        int ind1=ind2-1;
        int count = 0;
        int ind1el=-1,ind2el=-1;
        while(left<n1 && right<n2){
            if(nums1[left]<=nums2[right]){
               if(count==ind1) ind1el=nums1[left];
               if(count==ind2) ind2el=nums1[left];
               count ++;
               left++;
            }else{
               if(count==ind1) ind1el=nums2[right];
               if(count==ind2) ind2el=nums2[right];
               count ++;
               right++;
            }
        }
        while(left<n1){
              if(count==ind1) ind1el=nums1[left];
               if(count==ind2) ind2el=nums1[left];
               count ++;
               left++;
        }
        while(right<n2){
            if(count==ind1) ind1el=nums2[right];
            if(count==ind2) ind2el=nums2[right];
               count ++;
               right++;
        }
        
        if(n%2==1){
            return (double) ind2el;
        }
         return (double)(ind1el+ind2el)/2;
    }

   
public static void main(String[] args) {
    int nums1[]={1,2};
    int nums2[]={3,4};
    System.out.println(betterSolution(nums1, nums2));
}
    
}