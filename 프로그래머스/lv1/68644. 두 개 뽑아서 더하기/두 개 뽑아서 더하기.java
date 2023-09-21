import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
        List list = new ArrayList<>();
		for(int idx1=0; idx1<numbers.length; idx1++) {
			for(int idx2=idx1+1; idx2<numbers.length; idx2++) {
				//System.out.println(numbers[idx1]+"+"+numbers[idx2]);
				list.add(numbers[idx1]+numbers[idx2]);
			}
		}
		HashSet distinct = new HashSet<>(list);
		System.out.println(distinct);
		int[] answer = new int[distinct.size()];
		
		List distinct_list = new ArrayList<>(distinct);
        distinct_list.sort(null);
		 
		for(int idx=0; idx<distinct.size(); idx++) {
			answer[idx] = (int)distinct_list.get(idx);
		}
        return answer;
    }
}