package algorithm_study.두개뽑아서더하기;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Solution {

	public int[] solution(int[] numbers) {
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}

		int[] answer = new int[set.size()];
		int idx = 0;
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			answer[idx] = (int) iter.next();
			idx++;
		}
		Arrays.sort(answer);

		return answer;
	}
}
