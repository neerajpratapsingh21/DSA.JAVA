package string;



public class SortCharactersByFrequency {
    public static String sort(String s){
         int[] freq = new int[256];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        StringBuilder ans = new StringBuilder();

        while (ans.length() < s.length()) {

            int max = 0;

            // Find character with maximum frequency
            for (int i = 0; i < 256; i++) {
                if (freq[i] > freq[max]) {
                    max = i;
                }
            }

            // Append character frequency times
            for (int count = freq[max]; count > 0; count--) {
                ans.append((char) max);
            }

            // Mark this character as processed
            freq[max] = 0;
        }

        return ans.toString();
    }
    public static void main(String[] args) {
      System.out.println(sort("tree"));
    }
}
