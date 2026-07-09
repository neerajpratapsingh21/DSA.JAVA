package string;

public class ShortestPath {
    public static double shortestPath(String s){
        int x=0;
        int y=0;
      
        for(int i=0;i<s.length();i++){
              char currchar=s.charAt(i);
           if(currchar=='N'){
            y++;
           }else if(currchar=='S'){
            y--;
           }else if(currchar=='E'){
            x++;
           }else  if(currchar=='W'){
            x--;
           }
        }
        int ans=x*x+y*y;
        return Math.sqrt(ans);
    }
    public static void main(String[] args) {
        String s="WNEENESENNN";
        System.out.println(shortestPath(s));
    }
}
