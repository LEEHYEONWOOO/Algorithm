class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int idx = 0; idx < absolutes.length; idx++){
            answer += absolutes[idx] * (signs[idx]==true?1:-1);
        }
        return answer;
    }
}