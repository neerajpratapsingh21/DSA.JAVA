package string;

public class ReverseWordsInString {
    public static String reverseWords(String s){
        StringBuilder ans=new StringBuilder();
        s=s.trim();
        int end=s.length()-1;
        int idx=end;
        int last=end;
        while(end >=0){
             while ( end>=0 && s.charAt(end)==' '){
            end--;
         }     
          last=end;
          while(end>=0 && s.charAt(end)!=' '){
            end--;
          } 
          idx=end+1; 

                 if (ans.length() > 0) {
            ans.append(" ");
        }

        ans.append(s.substring(idx, last + 1));
                     
         }
        
         return ans.toString();
        }
        public static void main(String[] args) {
            System.out.println(reverseWords("the sky  is   blue "));
        }
}
