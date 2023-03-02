package programmers.level0.유한소수판별하기;

public class Solution {
	public int solution(int a, int b) {
		int newB = b / getGCD(a, b);

		while (newB != 1) {
			if (newB % 2 == 0) {
				newB /= 2;
			} else if (newB % 5 == 0) {
				newB /= 5;
			} else {
				return 2;
			}
		}
		return 1;
	}

	int getGCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return getGCD(b, a % b);
	}
}
