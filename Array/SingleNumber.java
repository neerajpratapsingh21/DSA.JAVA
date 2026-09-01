package array;


public class SingleNumber {
    public static int Bruteforce(int arr[]){
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
public static int OptimalXor(int arr[]){
    int xor=0;
    for(int i=0;i<arr.length;i++){
        xor=xor^arr[i];
    }
    return xor;
}

    


    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};
        System.out.println(OptimalXor(arr));
    }
}
