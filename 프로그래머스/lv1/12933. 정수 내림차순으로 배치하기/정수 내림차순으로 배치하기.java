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
		System.out.println(num_list);
		Collections.sort(num_list,Collections.reverseOrder());
		String nu = "";
		for(Long num : num_list) {
			nu += num;
		}
        answer = Long.parseLong(nu);
        return answer;
    }
}