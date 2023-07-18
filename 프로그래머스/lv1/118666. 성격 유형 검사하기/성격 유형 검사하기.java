import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
Map<String, Integer> map = new HashMap<>();
		int score = 0;
		String answer = "";
		
		map.put("R",0);
		map.put("T",0);
		map.put("C",0);
		map.put("F",0);
		map.put("J",0);
		map.put("M",0);
		map.put("A",0);
		map.put("N",0);
		
		for(int i=0; i<survey.length; i++) {
			score = choices[i] - 4;
			if(score > 0) {
				
				map.put(survey[i].substring(1,2),map.get(survey[i].substring(1,2))+score);
			}else if(score < 0) {
				
				map.put(survey[i].substring(0,1),map.get(survey[i].substring(0,1))+score*-1);
			}
		}
		answer += result(map,"R","T");
		answer += result(map,"C","F");
		answer += result(map,"J","M");
		answer += result(map,"A","N");
		return answer;
    }
    public static String result(Map<String, Integer> map,String ser1, String ser2) {
		if(map.get(ser1)>map.get(ser2)) {
			return ser1;
		}else if(map.get(ser1)<map.get(ser2)) {
			return ser2;
		}else {
			if(ser1.compareTo(ser2) < 0) {
				return ser1;
			}else {
				return ser2;
			}
		}
	}
}