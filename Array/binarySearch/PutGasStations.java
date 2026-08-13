package binarysearch;
public class PutGasStations {
    public static double minimizeMaxDistance(int arr[],int k){
      int n=arr.length;
      int howMany[]=new int[n-1];
      for(int gasStation=1;gasStation<=k;gasStation++){
        double  maxSection=-1;
        int maxInd=-1;
        for(int i=0;i<n-1;i++){
        double diff=arr[i+1]-arr[i];
        double sectionLength=diff/((double)howMany[i]+1);
        if(sectionLength>maxSection){
            maxSection=sectionLength;
            maxInd=i;
        }
        }
        howMany[maxInd]++;
      }
      double ans=-1;
      for(int i=0;i<n-1;i++){
        double diff=arr[i+1]-arr[i];
        double sectionLength=diff/((double)howMany[i]+1);
        ans=Math.max(sectionLength, ans);
      }
      return ans;
    }
public static void main(String[] args) {
    int arr[]={1,7};
    System.out.println(minimizeMaxDistance(arr, 2));
}
    
}