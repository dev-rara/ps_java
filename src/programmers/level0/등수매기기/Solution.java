package programmers.level0.등수매기기;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
	public int[] solution(int[][] score) {
		List<Integer> scoreList = new ArrayList<>();

		for (int[] s : score) {
			scoreList.add(s[0] + s[1]);
		}
		scoreList.sort(Comparator.reverseOrder());

		int[] answer = new int[score.length];
		for (int i = 0; i < score.length; i++) {
			answer[i] = scoreList.indexOf(score[i][0] + score[i][1]) + 1;
		}
		return answer;
	}
}
