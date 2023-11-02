class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int idx1=1; idx1<=n; idx1++){
            int sum = 0;
            for(int idx2=idx1; idx2<=n; idx2++){
                sum += idx2;
                if(sum == n){
                    System.out.println(n);
                    answer++;
                    idx2 = n;
                }else if(sum > n){
                    idx2 = n;
                }
            }
        }
        return answer;
    }
}