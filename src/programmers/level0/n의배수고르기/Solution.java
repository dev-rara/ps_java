package programmers.level0.n의배수고르기;

public class Solution {

	public int[] solution(int n, int[] numList) {
		int cnt = 0;

		for (int i = 0; i < numList.length; i++) {
			if (numList[i] % n == 0) {
				cnt++;
			}
		}

		int[] answer = new int[cnt];
		cnt = 0;
		for (int i = 0; i < numList.length; i++) {
			if (numList[i] % n == 0) {
				answer[cnt] = numList[i];
				cnt++;
			}
		}
		return answer;
	}
}
