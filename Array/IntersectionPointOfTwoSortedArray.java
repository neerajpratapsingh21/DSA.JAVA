package array;

import java.util.ArrayList;
import java.util.List;
public class IntersectionPointOfTwoSortedArray {
   
     public int[] intersectionArray(int[] nums1, int[] nums2) {
       List<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length &&  j<nums2.length){
            if(nums1[i]==nums2[j]){ans.add(nums1[i]); i++; j++;} 
            else if(nums1[i]<nums2[j]) i++;
            else j++;
        }
        int result[]=new int[ans.size()];
        for(int k=0;k<ans.size();k++){
            result[k]=ans.get(k);
        }
        return result;
    }
      
    
    public static void main(String[] args) {
        
    }
}
