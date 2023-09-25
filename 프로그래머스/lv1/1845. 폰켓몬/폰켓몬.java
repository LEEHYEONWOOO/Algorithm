import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List list = new ArrayList<>();
        for(int idx = 0; idx<nums.length; idx++){
            list.add(nums[idx]);
        }
        Set<Integer> set = new HashSet<Integer>(list);
        List<Integer> new_list = new ArrayList<Integer>(set);
        if(nums.length/2 <= new_list.size()){
            answer = nums.length/2;
        }else{
            answer = new_list.size();
        }
        return answer;
    }
}