class Solution {
    public String solution(String s) {
        String answer = "";
		int flag = 0;
		for(int idx=0; idx<s.length(); idx++) {
			if(s.charAt(idx)== ' ') {
				flag = 0;
				answer += ' ';
			}else if(flag == 0){
				flag = 1;
				if(s.charAt(idx) >= 97) {
					answer += (char)(s.charAt(idx)-32);
				}else {
					answer += s.charAt(idx);
				}
			}else if(flag == 1){
				flag = 0;
				if(s.charAt(idx) >= 97) {
					answer += s.charAt(idx);
				}else {
					answer += (char)(s.charAt(idx)+32);
				}
			}
		}
        return answer;
    }
}