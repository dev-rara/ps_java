package algorithm_study.평균구하기;

public class Solution {
	public double solution(int[] arr) {
		double answer = 0;
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		answer = (double)sum / arr.length;

		return answer;
	}
}
