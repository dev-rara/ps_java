package programmers.level0.양꼬치;

public class Solution {

	public int solution(int n, int k) {
		int answer = ((12000 * n) + (2000 * k));
		if (n >= 10) {
			answer = answer - (2000 * (n / 10));
		}

		return answer;
	}
}
