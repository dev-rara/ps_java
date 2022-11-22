package algorithm_study.모의고사;

import java.util.ArrayList;

public class Solution {

	public int[] solution(int[] answers) {
		int[] first = {1, 2, 3, 4, 5};
		int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int[] scores = {0, 0, 0};

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == first[i % 5]) {
				scores[0] += 1;
			}

			if (answers[i] == second[i % 8]) {
				scores[1] += 1;
			}

			if (answers[i] == third[i % 10]) {
				scores[2] += 1;
			}
		}

		int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < scores.length; i++) {
			if (maxScore == scores[i]) {
				list.add(i + 1);
			}
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}
