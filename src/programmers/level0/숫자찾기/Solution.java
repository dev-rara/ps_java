package programmers.level0.숫자찾기;

public class Solution {

	public int solution(int num, int k) {
		String answer = String.valueOf(num);

		if (answer.contains(String.valueOf(k))) {
			return answer.indexOf(String.valueOf(k)) + 1;
		} else {
			return -1;
		}
	}
}
