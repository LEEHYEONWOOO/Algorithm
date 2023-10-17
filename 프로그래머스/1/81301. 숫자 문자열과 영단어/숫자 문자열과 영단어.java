import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String temp = "";
        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		ArrayList<String> list = new ArrayList<>();
		for(int idx=0; idx<num.length; idx++) {
			list.add(num[idx]);
		}
		for(int idx=0; idx<s.length(); idx++){
            int flag = 3;
            while(flag!=6){
                if((int)s.charAt(idx)>=48 && (int)s.charAt(idx)<=57){
                    temp += s.substring(idx,idx+1);
                    break;
                }else if(list.contains(s.substring(idx,idx+flag))){
                    temp += list.indexOf(s.substring(idx,idx+flag));
                    idx += flag-1;
                    flag = 6;
                    break;
                }else {
                	flag++;
                }
            }
        }
		answer = Integer.parseInt(temp);
        return answer;
    }
}