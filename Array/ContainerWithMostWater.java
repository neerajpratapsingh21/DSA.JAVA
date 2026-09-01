package array;
public class ContainerWithMostWater {
    public static int Bruteforce(int height[]){
        int maxarea=0;
        
        for(int i=0;i<height.length;i++){
            
            for(int j=i+1;j<height.length;j++){
           int area=Math.min(height[i],height[j])*(j-i);
           maxarea=Math.max(maxarea, area);
            }
        }
        return maxarea;
    }
    public static int Twopointers(int height[]){
        int left=0;
        int right=height.length-1;
        int maxarea=0;
      
        while(left<right){
            int area=Math.min(height[left],height[right])*(right-left);
            if(height[left]<=height[right]){
            left++;
            }else{
            right--;
            }
            maxarea=Math.max(maxarea, area);
        }
        return maxarea;
    }
    public static void main(String[] args) {
        int height[]={1,1};
        System.out.println(Twopointers(height));
    }
    
}
