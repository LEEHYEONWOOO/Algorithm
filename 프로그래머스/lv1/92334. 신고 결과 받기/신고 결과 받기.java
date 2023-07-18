import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
	   List<String> ban_user = new ArrayList<String>();
	   //report_map : 피신고자,set[신고자]
	   Map<String,HashSet<String>> report_map = new HashMap<String,HashSet<String>>();//피신고자,신고자List
	   for(int i=0; i<report.length; i++) {
		   HashSet<String> reporter_list = new HashSet<String>();
		   if(report_map.get(report[i].split(" ")[1])==null) {
			   reporter_list.add(report[i].split(" ")[0]);
			   report_map.put(report[i].split(" ")[1], reporter_list);
		   }else {
			   report_map.get(report[i].split(" ")[1]).add(report[i].split(" ")[0]);
		   }
	   }
	   //System.out.println(report_map.get("frodo"));
	   
	   for(String user : report_map.keySet()) {
		   if(report_map.get(user).size() >= k) {
			   ban_user.add(user);
		   }
	   }
	   System.out.println("ban_user : " + ban_user);
	   
	   for(String user : ban_user) {
		   for(String reporter : report_map.get(user)) {
			   answer[Arrays.asList(id_list).indexOf(reporter)] += 1;
			   Arrays.asList(id_list).indexOf(reporter);
		   }
	   }
	   return answer;
    }
}