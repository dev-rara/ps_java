package algorithm_study.제일작은수제거하기;

public class Solution {

	public int[] solution(int[] arr) {
		int[] answer = new int[arr.length - 1];
		int minNum = Integer.MAX_VALUE;
		int minIdx = -1;

		if (arr.length == 1) {
			answer = new int[1];
			answer[0] = -1;
		} else {

			for (int i = 0; i < arr.length; i++) {
				if (minNum >= arr[i]) {
					minNum = arr[i];
					minIdx = i;
				}
			}

			for (int i = 0; i < minIdx; i++) {
				answer[i] = arr[i];
			}

			for (int i = minIdx; i < arr.length - 1; i++) {
				answer[i] = arr[i + 1];
			}
		}
		return answer;
	}
}
