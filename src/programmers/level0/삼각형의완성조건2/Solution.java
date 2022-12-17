package programmers.level0.삼각형의완성조건2;

public class Solution {
	public int solution(int[] sides) {
		int answer = 0;
		int max = Math.max(sides[0], sides[1]);
		int min = Math.min(sides[0], sides[1]);

		answer += min;
		answer += sides[0] + sides[1] - max - 1;

		return answer;
	}
}
