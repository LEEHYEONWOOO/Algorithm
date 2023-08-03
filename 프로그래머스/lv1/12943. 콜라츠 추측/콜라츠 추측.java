class Solution {
    public int solution(int num) {
    	int cnt = 0;
		while(num != 1) {
			num = collatz(num);
			cnt++;
		    if(cnt >= 500){
            cnt = -1;
            break;
            }
        }
        
		return cnt;
	}
	public static int collatz(int num) {
		if(num % 2 == 0) {
			num /= 2;
		}else if(num % 2 == 1) {
			num = num * 3 + 1;
		}
		return num;
	}
}