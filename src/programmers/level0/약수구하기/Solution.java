package programmers.level0.약수구하기;

import java.util.ArrayList;

public class Solution {

	public int[] solution(int n) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				list.add(i);
			}
		}

		return list.stream().mapToInt(Integer::intValue).toArray();
	}

}
