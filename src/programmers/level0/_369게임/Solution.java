package programmers.level0._369게임;

public class Solution {

	public int solution(int order) {
		String[] numbers = String.valueOf(order).split("");
		int answer = 0;

		for (String number : numbers) {
			if (number.matches(".*[3|6|9].*")) {
				answer++;
			}
		}
		return answer;
	}
}
