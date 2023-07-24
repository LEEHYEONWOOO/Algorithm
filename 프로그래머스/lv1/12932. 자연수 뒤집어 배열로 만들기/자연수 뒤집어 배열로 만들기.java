import java.util.*;
class Solution {
    public Integer[] solution(long n) {
        List<Integer> list = new ArrayList<Integer>();
		
		while(n > 0) {
			list.add((int)(n%10));
			n /= 10;
		}
		Integer[] answer = list.toArray(new Integer[0]);
        return answer;
    }
}