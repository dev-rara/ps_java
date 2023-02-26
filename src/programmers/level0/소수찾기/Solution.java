package programmers.level0.소수찾기;

public class Solution {
	public int solution(int n) {
		int answer = 0;

		for (int i = 2; i <= n ; i++) {
			boolean checkFlag = true;

			for (int j = 2; j <= Math.sqrt(i) ; j++) {
				if (i % j == 0) {
					checkFlag = false;
					break;
				}
			}

			if (checkFlag) {
				answer++;
			}
		}
		return answer;
	}
}
