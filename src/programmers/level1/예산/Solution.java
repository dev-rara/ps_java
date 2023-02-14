package programmers.level1.예산;

import java.util.Arrays;

public class Solution {

	public int solution(int[] d, int budget) {
		int answer = 0;

		Arrays.sort(d);
		for (int i = 0; i < d.length - 1; i++) {
			if (budget - d[i] >= 0) {
				budget -= d[i];
				answer++;
			}
		}
		return answer;
	}
}
