package programmers.level0.최대공약수와최소공배수;

public class Solution {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];

		answer[0] = getGCD(n, m);
		answer[1] = (n * m) / answer[0];

		return answer;
	}

	int getGCD(int m, int n) {
		if (n == 0) {
			return m;
		}
		return getGCD(n, m % n);
	}

}
