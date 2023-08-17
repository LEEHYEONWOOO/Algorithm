class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt = 0;
	        
	    for(int idx=left; idx<=right; idx++){
	        cnt = 0;
	        for(int i=1; i<=(int)Math.sqrt(idx); i++){
	            if(idx % i == 0){
	                cnt += 2;
	                if(idx/i == i){
	                    cnt -= 1;
	                }
	            }
	            if(i == (int)Math.sqrt(idx)){
	                answer += (cnt%2==0?idx:-idx);
	            }
	        }
	    }
        return answer;
    }
}