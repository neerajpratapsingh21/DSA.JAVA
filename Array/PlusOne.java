package array;
public class PlusOne {
    public static int[] plusByOne(int nums[]){
        int n=nums.length;
       int right=n-1;
         int rem=1;
         while(right>=0){
            int digit=nums[right]+rem;
           int num=digit%10;
           nums[right]=num;
            rem=digit/10;
             right--;
             }
           if(rem==1){
             int ans[]=new int[n+1];
            ans[0]=1;
              // Remaining elements are already 0 by default
            return ans;
         }
        


return nums;
        }  
    public static void main(String[] args) {
       int nums[]={1,9,9,9};
       int result[]=plusByOne(nums);
      for(int i:result){
        System.out.print(i+"  ");
      }
    }
}
