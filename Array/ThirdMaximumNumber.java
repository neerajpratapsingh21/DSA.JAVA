public class ThirdMaximumNumber {
    public static int thirdMaximum(int nums[]){
        long max=Long.MIN_VALUE;
        long smax=Long.MIN_VALUE;
        long tmax=Long.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == max && nums[i] == smax && nums[i] == tmax )continue;
            if(nums[i]>max){
                tmax=smax;
                smax=max;
                max=nums[i];
            }else if(nums[i]>smax && nums[i]!=max){
                tmax=smax;
                smax=nums[i];
            }else if(nums[i]>tmax && smax!=nums[i] && tmax != nums[i]){
                tmax=nums[i];
            }
        }
        if(tmax==Long.MIN_VALUE){
            return (int) max;
        }
    return (int) tmax;
    }
    public static void main(String[] args) {
        int nums[]={2,3,2};
        System.out.println(thirdMaximum(nums));
    }
}
