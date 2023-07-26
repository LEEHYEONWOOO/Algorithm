class Solution {
    public String solution(int n) {
        String answer = "";
        for(int idx=0; idx<n; idx++){
            if(idx%2==0){
                answer += "수";
            }else{
                answer += "박";
            }
        }
        return answer;
    }
}