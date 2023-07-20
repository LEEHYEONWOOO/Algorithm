class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int idx=1; idx<1000; idx++){
            if(n % idx == 1){
                answer= idx;
                break;
            }
        }
        if (answer==0) answer=n-1;
        return answer;
    }
}