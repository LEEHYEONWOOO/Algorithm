class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int Str_length = my_string.length();
        int answer_start = Str_length - n;
        answer = my_string.substring(answer_start);
        return answer;
    }
}