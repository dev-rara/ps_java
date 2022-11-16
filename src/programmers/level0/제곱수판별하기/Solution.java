package programmers.level0.제곱수판별하기;

public class Solution {
	public int solution(int n) {
		int answer = (int)Math.sqrt(n);

		if(Math.pow(answer, 2) == n) {
			return 1;
		} else {
			return 2;
		}
	}
}
