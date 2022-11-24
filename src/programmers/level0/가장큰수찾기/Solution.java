package programmers.level0.가장큰수찾기;

public class Solution {

	public int[] solution(int[] array) {
		int[] answer = new int[2];
		int maxNum = Integer.MIN_VALUE;
		int maxIdx = 0;

		for (int i = 0; i < array.length; i++) {
			if (maxNum < array[i]) {
				maxNum = array[i];
				maxIdx = i;
			}
		}
		answer[0] = maxNum;
		answer[1] = maxIdx;

		return answer;
	}

}
