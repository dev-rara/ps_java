package programmers.level0.피자나눠먹기1;

public class Solution {

	public int solution(int n) {
		int answer = 0;

		int a = n / 7;
		int b = n % 7;

		if(b == 0) {
			answer = a * 1;
		} else if (b != 0) {
			answer = a * 1 + 1;
		}
		return answer;
	}
}
