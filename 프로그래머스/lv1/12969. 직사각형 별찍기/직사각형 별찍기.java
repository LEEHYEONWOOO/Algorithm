import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String ans = "";
        for(int idx1 = 0; idx1 < b; idx1++){
            for(int idx2 = 0; idx2 < a; idx2++){
                ans += "*";
            }
            ans += "\n";
        }
        
        
        System.out.println(ans);
    }
}