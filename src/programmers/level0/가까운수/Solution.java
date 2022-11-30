package programmers.level0.가까운수;

import java.util.Arrays;

public class Solution {

	public int solution(int[] array, int n) {
		int answer = Integer.MAX_VALUE;
		int idx = -1;

		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			if (answer > Math.abs(array[i] - n)) {
				answer = Math.abs(array[i] - n);
				idx = i;
			}
		}
		return array[idx];
	}
}
