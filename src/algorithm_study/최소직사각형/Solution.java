package algorithm_study.최소직사각형;

public class Solution {

	public int solution(int[][] sizes) {
		int length = 0;
		int height = 0;

		for (int i = 0; i < sizes.length; i++) {
			length = Math.max(length, Math.max(sizes[i][0], sizes[i][1]));
			height = Math.max(height, Math.min(sizes[i][0], sizes[i][1]));
		}
		return length * height;
	}

}
