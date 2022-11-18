package algorithm_study.없는숫자더하기;

public class Solution {

	public int solution(int[] numbers) {
		int answer = 45;
		for (int num : numbers) {
			answer -= num;
		}

		return answer;
	}
}
