import java.util.*;
class Solution {
    public String solution(String new_id) {
        String answer = "";
       
       //1
	   answer = new_id.toLowerCase();
	   //2~4
	   answer = answer.replaceAll("[^0-9a-z-_.]", "");
	   answer = answer.replaceAll("[.]{2,}", ".");
	   answer = answer.replaceAll("^[.]{1}", "");

	   //5
	   if(answer.length()==0) {
		   answer = "a";
	   }
	   //6
	   if(answer.length()>=16) {
		   answer = answer.substring(0,15);
	   }
      if(answer.length() >0){
           if(answer.charAt(answer.length()-1)=='.') {
		            answer = answer.substring(0,answer.length()-1);
           }
      }
	   //7
	   if(answer.length()<=2) {
		   while(answer.length()!=3) {
			   answer += answer.charAt(answer.length()-1);
		   }
	   }
        return answer;
    }
}
