package programmers.level0.짝수홀수개수;

public class Solution {
	public int[] solution(int[] num_list) {
		int[] answer = new int[2];
		int oddCnt = 0;
		int evenCnt = 0;

		for(int num: num_list) {
			if (num % 2 == 0) {
				evenCnt++;
			} else {
				oddCnt++;
			}
		}

		answer[0] = evenCnt;
		answer[1] = oddCnt;

		return answer;
	}



}
