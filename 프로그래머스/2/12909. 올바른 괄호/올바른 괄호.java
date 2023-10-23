class Solution {
    boolean solution(String s) {
        boolean answer = true;
		int temp = 0;
		for(int idx=0; idx<s.length(); idx++) {
			if(s.charAt(0)==')') {
				answer = false;
				break;
			}
			if(s.charAt(idx)=='(') {
				temp += 1;
			}else {
				temp -= 1;
			}
            if(temp < 0) {
				answer = false;
				break;
			}
		}
		if(temp != 0) {
			answer = false;
		}

        return answer;
    }
}