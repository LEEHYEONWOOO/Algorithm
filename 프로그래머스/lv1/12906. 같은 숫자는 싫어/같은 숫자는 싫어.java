import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int temp = 10;
        for(int idx = 0; idx < arr.length; idx++){
            if(arr[idx] != temp){
                list.add(arr[idx]);
                temp = arr[idx];
            }
        }
        answer = list.stream().mapToInt(a->a).toArray();
        return answer;
    }
}