package programmers.level0.주사위의개수;

public class Solution {

	public int solution(int[] box, int n) {
		int answer = 1;

		for (int i = 0; i < box.length; i++) {
			answer *= box[i] / n;
		}

		return answer;
	}

}
