import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        List<Integer> draw_list = new ArrayList<>();    //뽑은 인형을 저장할 List
		int answer = 0;
		for(int move : moves) {
			//board와 move를 매개변수로 한 draw함수 실행 후 결과 List에 저장
            draw_list.add(draw(board,move));
            //List에 같은인형 두개가 연속해서 쌓였을때
            answer += get(draw_list);
		}
		return answer;
	}
	//board객체와 move객체를 매개변수
	public static int draw(int[][] board, int move) {
		int draw = 0;
		for(int idx=0; idx<board.length; idx++) {
			if(board[idx][move-1] != 0) {   //인형을 뽑았을 때,
				draw = board[idx][move-1];  //해당 인형 값 return
				board[idx][move-1] = 0;     //해당 인형자리 값 0으로 초기화
				break;
			}
		}
		return draw;
	}
	//List의 값이 연속적으로 저장됨을 판단 후 인형 수 +2, List에서 삭제
	public static int get(List<Integer> draw_list) {
		if(draw_list.size()>1) {
			for(int idx=1; idx<draw_list.size(); idx++) {
				if(draw_list.get(idx)!=0 && draw_list.get(idx)==draw_list.get(idx-1)) { //조건 : list.get(idx) == list.get(idx-1)
					draw_list.remove(idx);  //List삭제
					draw_list.remove(idx-1);    //List삭제
					return 2;   //조건 만족 했으므로 인형수 +2
				}
			}
		}
		return 0;   //조건 불만족 했으므로 인형수 +0
	}
    
}
