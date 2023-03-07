package programmers.level0.특이한정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

	public int[] solution(int[] numlist, int n) {
		List<Integer> nums = new ArrayList<>();
		Arrays.sort(numlist);

		for (int num : numlist) {
			nums.add(num);
		}
		nums.sort((s1, s2) -> Integer.compare(Math.abs(s2 - n), Math.abs(s1 -n)));
		Collections.reverse(nums);    // 거꾸로 뒤집기

		return nums.stream().mapToInt(num -> num).toArray();
	}
}
