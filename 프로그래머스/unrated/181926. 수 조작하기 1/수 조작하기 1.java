import java.util.*;
class Solution {
    public int solution(int n, String control) {
        int answer = n;
        Map<String, Integer> map = new HashMap<>();
		map.put("w", 1);
		map.put("a", -10);
		map.put("s", -1);
		map.put("d", 10);
        for(int i=0; i<control.length(); i++){
            answer += map.get(control.substring(i,i+1));
        }
        return answer;
    }
}