package programmers.level0.K의개수;

public class Solution {

	public int solution(int i, int j, int k) {
		int answer = 0;

		for (int idx = i; idx <= j; idx++) {
			if (String.valueOf(idx).contains(String.valueOf(k))) {
				int z = idx;

				while (z != 0) {
					if (z % 10 == k) {
						answer++;
					}
					z /= 10;
				}
			}
		}
		return answer;
	}
}
