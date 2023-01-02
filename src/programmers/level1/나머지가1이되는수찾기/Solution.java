package programmers.level1.나머지가1이되는수찾기;

public class Solution {
	public int solution(int n) {
		int answer = Integer.MAX_VALUE;

		for (int i = 1; i<= n; i++) {
			if (n % i == 1) {
				answer = Math.min(i, answer);
			}
		}

		return answer;
	}
}
