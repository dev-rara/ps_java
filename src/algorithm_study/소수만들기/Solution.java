package algorithm_study.소수만들기;

public class Solution {

	public int solution(int[] nums) {
		int answer = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int sum = nums[i] + nums[j] + nums[k];

					answer += checkNumber(sum) ? 1 : 0;
				}
			}
		}

		return answer;
	}

	public boolean checkNumber(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
