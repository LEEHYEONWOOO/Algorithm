import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        List<String> new_str = new ArrayList<>();
		for(int idx = 0; idx < s.length(); idx++) {
			new_str.add(s.substring(idx,idx+1));
		}
		Collections.sort(new_str,Collections.reverseOrder());
        for(String ans : new_str){
            answer += ans;
        }
        return answer;
    }
}