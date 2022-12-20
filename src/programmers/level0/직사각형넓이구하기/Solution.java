package programmers.level0.직사각형넓이구하기;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	public int solution(int[][] dots) {
		Arrays.sort(dots, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});

		int x = Math.abs(dots[1][1] - dots[0][1]);
		int y = Math.abs(dots[2][0] - dots[0][0]);

		return x * y;
	}
}
