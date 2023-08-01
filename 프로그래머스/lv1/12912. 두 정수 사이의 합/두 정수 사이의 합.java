class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int temp = b;
        if(a > b){
            b = a;
            a = temp;
        }
        answer = (long)(b - a + 1) * (a + b) / 2;
        
        return answer;
    }
}