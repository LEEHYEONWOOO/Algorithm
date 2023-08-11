import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length == 1){
            return new int[]{-1};
        }
		int min = Arrays.stream(arr).min().getAsInt();
		answer = Arrays.stream(arr)
					.filter(a -> a!=min)
					.toArray();
        
        return answer;
    }
}