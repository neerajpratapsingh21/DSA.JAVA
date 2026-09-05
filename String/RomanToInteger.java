package string;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInteger(String s){
        Map<Character,Integer> map=Map.of('I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000);
int result=0;
for(int i=s.length()-1;i>=0;i-- ){
    int curr=map.get(s.charAt(i));
    int next=(i<s.length()-1) ? map.get(s.charAt(i+1)) :0;
    if(curr<next){
        result-=curr;
    }else{
        result+=curr;
    }
  }
  return result;
    }
    public static void main(String[] args) {
    System.out.println(romanToInteger("IVX"));
    }
}