class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        for(int idx=0; idx<s.length(); idx++) {
			int s_num = s.charAt(idx);
			if(s_num < 48 || s_num > 57 || !(s.length() == 4 || s.length() == 6)) {
				answer = false;
                return answer;
			}
		}
        
        return answer;
    }
}