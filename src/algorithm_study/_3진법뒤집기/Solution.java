package algorithm_study._3진법뒤집기;

import java.util.ArrayList;

public class Solution {
	public int solution(int n) {
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<>();

		while (n != 0) {
			list.add(n % 3);
			n /= 3;
		}

		int idx = 0;
		for (int i = list.size() - 1; i >= 0; i--) {
			answer += list.get(i) * Math.pow(3, idx);
			idx++;
		}

		return answer;
	}
}
