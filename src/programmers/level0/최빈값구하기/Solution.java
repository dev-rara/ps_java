package programmers.level0.최빈값구하기;

public class Solution {

	public int solution(int[] array) {
		int[] arr = new int[1000];
		for (int i : array) {
			arr[i]++;
		}

		int max = 0;
		int maxIdx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxIdx = i;
			}
		}

		int count = 0;
		for (int i : arr) {
			if (i == max) {
				count++;
			}
		}
		return count > 1? -1 : maxIdx;
	}
}
