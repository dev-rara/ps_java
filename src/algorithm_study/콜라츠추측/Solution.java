package algorithm_study.콜라츠추측;

public class Solution {

	public int solution(int num) {
		int answer = 0;
		long number = (long) num;

		if (num == 1) {
			return 0;
		}

		while (number != 1) {
			if (answer == 500) {
				return -1;
			}

			if (number % 2 == 0) {
				number /= 2;
			} else {
				number = number * 3 + 1;
			}
			answer++;
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(626331));
	}

}
