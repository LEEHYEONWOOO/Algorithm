import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length == 1){
            return new int[]{-1};
        }
        List<Integer> list = new ArrayList<>();
		for(int a : arr) {
			list.add(a);
		}
		int min = Collections.min(list);
		answer = Arrays.stream(arr)
					.filter(a -> a!=min)
					.toArray();
        
        return answer;
    }
}