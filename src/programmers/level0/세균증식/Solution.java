package programmers.level0.세균증식;

public class Solution {

	public int solution(int n, int t) {
		int answer = n;

		for (int i = 0; i < t; i++) {
			answer *= 2;
		}
		return answer;
	}
}
