package programmers.level0.배열의평균값;

public class Solution {

	public double solution(int[] numbers) {
		double answer = 0;
		for (int i = 0; i < numbers.length; i++) {
			answer += numbers[i];
		}
		answer = answer / numbers.length;

		return answer;
	}
}
