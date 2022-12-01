package programmers.level0.진료순서정하기;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

	public int[] solution(int[] emergency) {
		int[] answer = emergency.clone();
		Arrays.sort(answer);

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < answer.length; i++) {
			map.put(answer[i], answer.length - i);
		}

		for (int i = 0; i < emergency.length; i++) {
			emergency[i] = map.get(emergency[i]);
		}

		return emergency;
	}
}
