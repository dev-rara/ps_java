package algorithm_study.부족한금액계산하기;

public class Solution {

	public long solution(int price, int money, int count) {
		long answer = 0;
		for (int i = 1; i <= count; i++) {
			answer += (long) price * i;
		}
		answer = money - answer;

		return answer < 0 ? Math.abs(answer) : 0;
	}
}
