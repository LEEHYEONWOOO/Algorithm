import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        List<Integer> tmp = new ArrayList<>();
		for(int idx = 0; idx<arr.length; idx++) {
			if(arr[idx] % divisor == 0) {
				tmp.add(arr[idx]);
                
			}
		}
        if(tmp.size() == 0){
            tmp.add(-1);
        }
        Collections.sort(tmp);
		int[] arr4 = tmp.stream()
                .mapToInt(i -> i)
                .toArray();
		answer = arr4;
        
        return answer;
    }
}