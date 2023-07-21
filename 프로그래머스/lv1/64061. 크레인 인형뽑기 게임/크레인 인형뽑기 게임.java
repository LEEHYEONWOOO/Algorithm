import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        		List<Integer> draw_list = new ArrayList<>();
		int answer = 0;
		for(int move : moves) {
			draw_list.add(draw(board,move));
			answer = get(draw_list,answer);
		}
		return answer;
	}
	
	public static int draw(int[][] board, int move) {
		int draw = 0;
		for(int idx=0; idx<board.length; idx++) {
			if(board[idx][move-1] != 0) {
				draw = board[idx][move-1];
				board[idx][move-1] = 0;
				break;
			}
		}
		return draw;
	}
	
	public static int get(List<Integer> draw_list,int answer) {
		if(draw_list.size()>1) {
			for(int idx=1; idx<draw_list.size(); idx++) {
				if(draw_list.get(idx)!=0 &&  draw_list.get(idx)==draw_list.get(idx-1)) {
					draw_list.remove(idx);
					draw_list.remove(idx-1);
					System.out.println(draw_list);
					return answer+2;
				}
			}
		}
		return answer;
	}
    
}