class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr;
        for(int i=0; i<arr.length; i++){
            if(arr.length%2==0){
               if(i%2==1){
                 answer[i] = answer[i]+n;
               }
            }else if(arr.length%2==1){
             if(i%2==0){
                 answer[i] = answer[i]+n;
               }
            }
        }
        return answer;
    }
}