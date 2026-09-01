package array;



public class ContainsDuplicate {
public static boolean checkDuplicate(int num[]){
    
    for(int i=0;i<num.length;i++){
        for(int j=0;j<num.length;j++){
           if(num[i]==num[j]){
            return true;

           }
        }
    }
   return false;
    
}
   
    public static void main(String[] args) {
int num[]={1,2,3,1};
System.out.println(checkDuplicate(num));


        
    }
}


    

