class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
		
		long total = 0;
		for(int idx=1; idx<=count; idx++) {
			total += idx*price;
		}
		System.out.println(total);
		if(money < total) {
			answer = total - money;
		}
        return answer;
    }
}