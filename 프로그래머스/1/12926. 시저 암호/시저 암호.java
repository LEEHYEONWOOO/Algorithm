class Solution {
    public String solution(String s, int n) {
        String answer = "";
		for(int idx=0; idx<s.length(); idx++) {
			char ch = s.charAt(idx);
			if(ch==' ') {
				answer += ch;
				continue;
			}
			if(ch>='a' && ch<='z') {
				if(ch+n > 'z') {
					answer += (char)(ch-26+n);
				}else {
					answer += (char)(ch+n);
				}
			}else if(ch>='A' && ch<='Z') {
				if(ch+n > 'Z') {
					answer += (char)(ch-26+n);
				}else {
					answer += (char)(ch+n);
				}
			}
		}
		return answer;
    }
}