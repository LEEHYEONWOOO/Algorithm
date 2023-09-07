import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
		List<Integer> list = new ArrayList<>();
		for(int idx = 0; idx < d.length; idx++) {
			list.add(d[idx]);
		}
		list.sort(null);
		
		int idx = 0;
		while(budget >= 0) {
			if(list.size() <= idx) {
				break;
			}
            budget -= list.get(idx);
            if(budget < 0){
                break;
            }
			answer += 1;
			idx++;
		}
        return answer;
    }
}