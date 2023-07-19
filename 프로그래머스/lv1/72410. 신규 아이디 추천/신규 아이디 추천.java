import java.util.*;
class Solution {
    public String solution(String new_id) {
        String answer = "";
        String special = "~!@#$%^&*()=+[{]}:?,<>/";
        //1
	   new_id = new_id.toLowerCase();
	   //2
	   for(int i=0; i<new_id.length(); i++) {
		   if(special.contains(new_id.substring(i,i+1))) {
			   new_id = new_id.replace(new_id.substring(i,i+1), "");
			   i--;
		   }
	   }
	   //3
	   while(true) {
		   if(new_id.contains("..")) {
			   new_id = new_id.replace("..", ".");
		   }else {
			   break;
		   }
	   }
	   //4
       if(new_id.contains(".")) {
	       if(new_id.substring(0,1).equals(".")) {
               new_id = new_id.substring(1);
	       }
           if(new_id.length() >0){
                if(new_id.charAt(new_id.length()-1)=='.') {
		            new_id = new_id.substring(0,new_id.length()-1);
	            }
           }
       }
	   //5
	   if(new_id.length()==0) {
		   new_id = "a";
	   }
	   //6
	   if(new_id.length()>=16) {
		   new_id = new_id.substring(0,15);
	   }
       if(new_id.length() >0){
            if(new_id.charAt(new_id.length()-1)=='.') {
		            new_id = new_id.substring(0,new_id.length()-1);
            }
       }
	   //7
	   if(new_id.length()<=2) {
		   while(new_id.length()!=3) {
			   new_id += new_id.charAt(new_id.length()-1);
		   }
	   }
        answer = new_id;
        return answer;
    }
}