package programmers.level0._7의개수;

public class Solution {

	public int solution(int[] array) {
		int answer = 0;

		for (int num : array) {
			String str = String.valueOf(num);

			for (int j = 0; j < str.toCharArray().length; j++) {
				if (str.charAt(j) == '7') {
					answer++;
				}
			}
		}
		return answer;
	}
}
