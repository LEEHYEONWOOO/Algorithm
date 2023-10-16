class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even_num = "";
        String odd_num = "";
        for(int idx = 0; idx < num_list.length; idx++){
            if(num_list[idx] % 2 == 0){
                even_num += num_list[idx];
            }else{
                odd_num += num_list[idx];
            }
        }
        answer = Integer.parseInt(odd_num) + Integer.parseInt(even_num);
        return answer;
    }
}