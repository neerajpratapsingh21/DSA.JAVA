package array.binarySearch;
public class PaintersPartition{
     public static int findMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i : arr){
            max=Math.max(i, max);
        }
        return max;
    }
     public static int findSum(int arr[]){
        int sum=0;
        for(int i : arr){
            sum+=i;
        }
        return sum;
    }
   public static  int countPainters(int[] boards, int time) {
        int painters = 1;         // Start with one painter
        int boardsPainter = 0;    // Time consumed by current painter

        for (int board : boards) {
            if (boardsPainter + board <= time) {
                // Assign board to current painter
                boardsPainter += board;
            } else {
                // Assign board to next painter
                painters++;
                boardsPainter = board;
            }
        }

        return painters;
    }

    // Function to find the minimum possible maximum time to paint all boards using k painters
    public static int bruteForce(int[] boards, int k) {
        int low = findMax(boards);  // Largest single board
        int high =findSum(boards);            // Sum of all boards

        for (int time = low; time <= high; time++) {
            if (countPainters(boards, time) <= k) {
                return time;  // Found a valid minimum time
            }
        }

        return low;  // Fallback (shouldn't usually reach here)
    }
    public static int optimalSolution(int[] boards, int k) {
        int low = findMax(boards);
        int high = findSum(boards);
        int result = high;

        while (low <= high) {
            int mid = (low + high) / 2;
            int painters = countPainters(boards, mid);

            if (painters > k) {
                low = mid + 1; // Too few painters → increase allowed time
            } else {
                result = mid; // Valid time → try to reduce it
                high = mid - 1;
            }
        }

        return result;
    }
public static void main(String[] args) {
    int board[]={12,34,67,90};
    System.out.println(bruteForce(board, 2));
    System.out.println(optimalSolution(board, 2));
}
    
}