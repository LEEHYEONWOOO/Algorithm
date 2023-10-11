class Solution {
    public int solution(String t, String p) {
         int answer = 0;
        for(int idx=0; idx<t.length()-p.length()+1; idx++){
            long a = Long.parseLong(t.substring(idx,idx+p.length()));
            long b = Long.parseLong(p);
            if(a<=b){
                answer++;
            }
        }
        return answer;
    }
}