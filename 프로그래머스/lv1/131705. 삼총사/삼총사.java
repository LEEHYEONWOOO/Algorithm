class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int num0 = 0;
		int num1 = 1;
		int num2 = 2;
        
        while(num0 + num1 + num2 <= number.length*3-6) {
			if(number[num0] + number[num1] + number[num2] == 0) {
				answer += 1;
			}
			if(num1 + num2 == number.length*2-3) {
				num0 += 1;
				num1 = num0+1;
				num2 = num0+2;
			}else if(num2 == number.length-1) {
				num1 += 1;
				num2 = num1+1;
			}else {
				num2 += 1;
			}
		}
        
        return answer;
    }
}