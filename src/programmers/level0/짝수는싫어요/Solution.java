package programmers.level0.짝수는싫어요;

public class Solution {

	public int[] solution(int n) {
		int[] answer = new int[n % 2 == 0 ? n / 2 : n / 2 + 1];

		int idx = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				answer[idx] = i;
				idx++;
			}
		}
		return answer;
	}
}
