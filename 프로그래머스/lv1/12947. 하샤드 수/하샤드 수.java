class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int num = 0;
        int temp = x;
        while(temp >= 1){
            num += temp%10;
            temp /= 10;
        }
        if(x%num == 0){
            answer = true;
        }
        return answer;
    }
}