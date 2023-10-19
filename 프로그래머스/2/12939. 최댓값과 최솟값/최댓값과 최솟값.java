import java.util.*;
class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
		int[] int_arr = new int[arr.length];
		for(int idx=0; idx<arr.length; idx++) {
			int_arr[idx] = Integer.parseInt(arr[idx]);
		}
		Arrays.sort(int_arr);
		String answer = int_arr[0] + " " + int_arr[int_arr.length-1];
        return answer;
    }
}