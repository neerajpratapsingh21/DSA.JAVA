package array;
public class MissingNumber {
    public static int BruteForce(int arr[]){
        int n=arr.length+1;
         for(int i=1;i<=n;i++){
            boolean found =false;
            for(int j=0;j<n-1;j++){
                if(arr[j]==i){
                    found =true;
                    break;
                }
            }
            if(found==false){
                return i;
            }

         }
         return -1;
    }
    public static int hashing(int arr[]){
        int n=arr.length+1;
    int hash[]=new int[n];
    for(int i=0;i<n-1;i++){
        hash[arr[i]]++;
    }
    for(int i=0;i<n;i++){
        if(hash[i]==0){
            return i;
        }
    }
    return -1;
    }
    public static int sumApproach(int arr[]){
        int Expected = 0;
        int Actual = 0;
        int n=arr.length;
        for(int i=0; i<=n;i++){
        Expected+=i;
        }
        for(int i=0;i<n;i++){
            Actual+=arr[i];
        }
        return Expected-Actual;
    }
    public static void main(String[] args) {
        int arr[]={1,2,0,4,5};
        System.out.println(sumApproach(arr));
    }
}
