package programmers.level0.팩토리얼;

public class Solution {

	public int solution(int n) {
		int answer = 0;

		for (int i = 0; i <= n; i++) {
			if (factorial(i) > n) {
				break;
			}
			answer = i;
		}
		return answer;
	}

	public int factorial(int num) {
		if (num <= 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}
}
