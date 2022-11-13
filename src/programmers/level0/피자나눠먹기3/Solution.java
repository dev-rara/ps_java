package programmers.level0.피자나눠먹기3;

public class Solution {

	public int solution(int slice, int n) {
		int a = n % slice;
		int answer = 0;

		if (a == 0) {
			answer = n / slice;
		} else {
			answer = (n / slice) + 1;
		}

		return answer;
	}
}
