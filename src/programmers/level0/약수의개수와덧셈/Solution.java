package programmers.level0.약수의개수와덧셈;

public class Solution {
	public int solution(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) {
			if (getNumber(i)) {
				answer += i;
			} else {
				answer -= i;
			}
		}
		return answer;
	}

	public boolean getNumber(int num) {
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		return count % 2 == 0;
	}
}
