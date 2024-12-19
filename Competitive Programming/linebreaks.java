import java.util.Scanner;

public  class linebreaks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        
        Solution s = new Solution();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // Number of strings
            int m = sc.nextInt(); // Maximum line length
            sc.nextLine(); // Clear the buffer
            
            String[] a = new String[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextLine(); // Read strings
            }
            System.out.println(s.linebreak(a, n, m)); // Calculate and print result
        }
        sc.close();
    }
}

class Solution {
   public int linebreak(String[] arr, int n, int m) {
        int cnt = 0;
        for(int i=0;i<arr.length; i++){
            m = m - arr[i].length();
            if(m<0){
                break;
            }else{
                cnt++;
            }
        }
        
        return cnt;
    }
}
