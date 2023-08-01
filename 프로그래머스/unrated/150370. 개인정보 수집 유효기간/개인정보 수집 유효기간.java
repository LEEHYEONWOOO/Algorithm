import java.util.*;

class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        for(int i=0;i<privacies.length;i++) {
			privacies[i] = expire(privacies[i],terms);
		}
		
		List<Integer> answer = new ArrayList<Integer>();
		for(int i=0; i<privacies.length; i++) {
			if(year(privacies[i]) < year(today)) {
				answer.add(i+1);
			}else if(year(privacies[i]) == year(today) && month(privacies[i])<month(today)) {
				answer.add(i+1);
			}else if(year(privacies[i]) == year(today) && month(privacies[i])==month(today) && 
					day(privacies[i])<day(today)) {
				answer.add(i+1);
			}
		}
		
		
		return answer;
    }
    
    public static String expire(String privacy, String[] terms) {
		String[] split_privacy = privacy.split("\\.");
		String term = privacy.substring(privacy.length()-1);
		for(int i=0; i<terms.length; i++) {
			if(terms[i].substring(0,1).equals(term)) {
				term = terms[i].split(" ")[1];
			}
		}
		
		int day = Integer.parseInt(split_privacy[2].substring(0,2))-1;
		int month = Integer.parseInt(split_privacy[1]);
		int year = Integer.parseInt(split_privacy[0]);
		
		if(day == 0) {
			day = 28;
			month -= 1;
		}
        if(month == 0) {
			year -= 1;
			month = 12;
		}
		int new_month = month + Integer.parseInt(term);
		if(new_month>12) {
			if(new_month%12 !=0) {
				year += new_month/12;
				new_month %= 12;
			}else {
				year +=(new_month-12)/12;
				new_month=12;
			}
		}
		return year+"."+new_month+"."+day;
	}
	
	public static int day(String privacy) {
		int day = Integer.parseInt(privacy.split("\\.")[2]);
		return day;
	}
	
	public static int month(String privacy) {
		int month = Integer.parseInt(privacy.split("\\.")[1]);
		return month;
	}
	
	public static int year(String privacy) {
		int year = Integer.parseInt(privacy.split("\\.")[0]);
		return year;
	}
    
}
