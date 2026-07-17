package string;

public class LengthOfLastWord {
    public static int optimalSolution(String s){
          if(s.length()==0) return 0;
            int i=s.length()-1;
            while( i>=0 && s.charAt(i) == ' '){
          i--;
       }
       int count = 0;
        while( i>=0 && s.charAt(i) != ' '){
          i--; count++;
       }
       return count ;
    }
    public static int lengthOfLastWord(String s){
        if(s.length()==0) return 0;
      s=  s.trim();
        int i=s.length()-1;
       
       while( i>=0 && s.charAt(i) != ' '){
          i--;
       }

       return s.substring(i+1, s.length()).length();

    }
    public static void main(String[] args) {
        System.out.println(optimalSolution("   fly me   to   the moon  "));
    }
}
