package array.binarySearch;

public class SingleElementInSortedArray {
    public static int bruteforce(int arr[]){
       for(int i=0;i<arr.length;i++){
        boolean found=false;
        for(int j=0;j<arr.length;j++){
           if(arr[i]==arr[j] && i!=j){
            found=true;
            break;
           }
        }
        if(!found){
            return arr[i];
        }
    }
return -1;
}
public static int xorApproach(int arr[]){
    int xor=0;
    for(int i=0;i<arr.length;i++){
        xor=xor^arr[i];
    }
    return xor;
}
public static int optimalSolution(int arr[]){
int n=arr.length;
if(n==1)  return arr[0];
int low =1;
int high=n-2;
if(arr[0]!=arr[1]) return arr[0];
if(arr[n-1]!=arr[n-2]) return arr[n-1];
while(low<=high){
    int mid = low + (high-low)/2;
    if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){
        return arr[mid];
    }
    if(((mid%2==1) && arr[mid]==arr[mid-1]) || ((mid%2==0) && arr[mid]==arr[mid+1]) ){
        low =mid +1;

    }else{
        high =mid -1;
    }
}
return -1;
}
public static void main(String[] args) {
    int arr[]={1,2,2};
    System.out.println(optimalSolution(arr));
}
}
