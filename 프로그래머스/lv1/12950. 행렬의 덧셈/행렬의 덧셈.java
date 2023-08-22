class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int idx1 = 0; idx1 < arr1.length; idx1++){
            for(int idx2 = 0; idx2 < arr1[0].length; idx2++){
                answer[idx1][idx2] = arr1[idx1][idx2] + arr2[idx1][idx2];
            }
        }
        return answer;
    }
}