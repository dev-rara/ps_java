package programmers.level0.피자나눠먹기2;

public class Solution {

	public int solution(int n) {
		int pizza = 1;

		while (true) {
			if ((pizza * 6) % n == 0) {
				return pizza;
			}
			pizza++;
		}
	}
}
