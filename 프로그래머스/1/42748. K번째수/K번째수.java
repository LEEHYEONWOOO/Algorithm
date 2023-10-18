import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; 
		for(int idx=0; idx<commands.length; idx++) {
			int[] temp = Arrays.copyOfRange(array, commands[idx][0]-1, commands[idx][1]);
			List<Integer> list = new ArrayList<>();
            for(int idx2=0; idx2<temp.length; idx2++){
                list.add(temp[idx2]);
            }
			list.sort(null);
			answer[idx] = list.get(commands[idx][2]-1);
		}
        return answer;
    }
}