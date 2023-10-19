class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
		
		for(int idx=0; idx<s.length(); idx++) {
			if(idx==0 && (s.charAt(idx)>=97 && s.charAt(idx)<=122)) {
				answer += (char)(s.charAt(idx)-32);
			}else if(idx==0){
				answer += s.charAt(idx);
			}
			if(idx!=0 && s.charAt(idx-1)==32 && (s.charAt(idx)>=97 && s.charAt(idx)<=122)) {
				answer += (char)(s.charAt(idx)-32);
			}else if(idx!=0){
				answer += s.charAt(idx);
			}
		}
        return answer;
    }
}