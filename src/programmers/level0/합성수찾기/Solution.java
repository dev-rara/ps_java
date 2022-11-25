package programmers.level0.합성수찾기;

import java.util.ArrayList;

public class Solution {
	public int solution(int n) {
		int answer = 0;

		for(int i = 1; i <= n; i++) {
			if (divisor(i) >= 3) {
				answer++;
			}
		}
		return answer;
	}

	public int divisor(int num) {
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 1; i <= (int)num / 2 ; i++) {
			if(num % i == 0) {
				result.add(i);
			}
		}
		result.add(num);

		return result.size();
	}
}
