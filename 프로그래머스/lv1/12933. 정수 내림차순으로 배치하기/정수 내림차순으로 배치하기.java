import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        long a = n;
		List<Long> num_list = new ArrayList<>();
		while(a>=1) {
			num_list.add(a%10);
			a /= 10;
		}
		Collections.sort(num_list,Collections.reverseOrder());
		String num = "";
		for(Long l : num_list) {
			num += l;
		}
        answer = Long.parseLong(num);
        return answer;
    }
}