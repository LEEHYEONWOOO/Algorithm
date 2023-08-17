import java.util.*;
import java.util.stream.*;


class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
		for(int idx=1; idx<10; idx++) {
			if(!list.contains(idx)) {
				answer += idx;
			}
		}
        
        return answer;
    }
}