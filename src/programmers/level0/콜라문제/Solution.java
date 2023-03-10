package programmers.level0.콜라문제;

public class Solution {
	public int solution(int a, int b, int n) {
		int answer = 0;
		int remainCnt = n;

		while(remainCnt >= a) {
			answer += remainCnt / a * b;
			remainCnt = remainCnt / a * b + remainCnt % a;
		}
		return answer;
	}
}
