class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int s1 = 0;
        int s2 = 0;
        int temp = 0;
        for(int idx=0; idx<sizes.length; idx++){
            if(sizes[idx][0] < sizes[idx][1]){
                temp = sizes[idx][0];
                sizes[idx][0] = sizes[idx][1];
                sizes[idx][1] = temp; 
            }
            if(s1 < sizes[idx][0]){
                s1 = sizes[idx][0];
            }
            if(s2 < sizes[idx][1]){
                s2 = sizes[idx][1];
            }
        }
        answer = s1 * s2;
        return answer;
    }
}