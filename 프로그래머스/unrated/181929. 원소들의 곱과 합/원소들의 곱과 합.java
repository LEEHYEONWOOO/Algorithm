class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int cal1=1;
        int cal2=0;
        for(int i=0; i<num_list.length; i++){
            cal1 *= num_list[i];
            cal2 += num_list[i];
        }
        cal2 = cal2*cal2;
        if(cal1<cal2){
            answer=1;
        }
        return answer;
    }
}