import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
	   List<String> ban_user = new ArrayList<String>();
        
	   //report_map : 피신고자,HashSet[신고자]
	   Map<String,HashSet<String>> report_map = new HashMap<String,HashSet<String>>();
	   for(int i=0; i<report.length; i++) {
		   HashSet<String> reporter_list = new HashSet<String>();
		   if(report_map.get(report[i].split(" ")[1])==null) {
			   reporter_list.add(report[i].split(" ")[0]);
			   report_map.put(report[i].split(" ")[1], reporter_list);
		   }else {
			   report_map.get(report[i].split(" ")[1]).add(report[i].split(" ")[0]);
		   }
	   }
	   //피신고 횟수가 k 이상이면 List<String> ban_user에 저장
	   for(String user : report_map.keySet()) {
		   if(report_map.get(user).size() >= k) {
			   ban_user.add(user);
		   }
	   }
	   //ban_user 객체에서 피신고자의 아이디로 report_map에 키값으로 넣어 신고자 이름 출력
	   for(String user : ban_user) {    //ban_user 객체에서 피신고자의 아이디로
		   for(String reporter : report_map.get(user)) {    //report_map에 키값으로 넣어 신고자 이름 출력
			   answer[Arrays.asList(id_list).indexOf(reporter)] += 1; //id_list에서 신고자의 인덱스값을 가져오고,
                                                                        //answer의 해당 인덱스에 +1 처리
		   }
	   }
	   return answer;
    }
}
