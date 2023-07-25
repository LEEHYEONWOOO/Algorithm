import java.util.*;
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for(int idx=0; idx<phone_number.length()-4; idx++){
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length()-4);
        return answer;
    }
}