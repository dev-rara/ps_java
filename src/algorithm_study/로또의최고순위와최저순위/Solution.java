package algorithm_study.로또의최고순위와최저순위;

public class Solution {

	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int winCnt = 0;
		int zeroCnt = 0;

		for (int i = 0; i < lottos.length; i++) {
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					winCnt++;
				}
			}

			if (lottos[i] == 0) {
				zeroCnt++;
			}
		}

		answer[0] = getGrade(winCnt + zeroCnt);
		answer[1] = getGrade(winCnt);

//		if (zeroCnt == 6) {
//			answer[0] = 1;
//			answer[1] = 6;
//		} else if (zeroCnt == 0 && winCnt == 0) {
//			answer[0] = 6;
//			answer[1] = 6;
//		}else {
//			if (winCnt + zeroCnt == 6) {
//				answer[0] = 1;
//			} else if (winCnt + zeroCnt == 5) {
//				answer[0] = 2;
//			} else if (winCnt + zeroCnt == 4) {
//				answer[0] = 3;
//			} else if (winCnt + zeroCnt == 3) {
//				answer[0] = 4;
//			} else if (winCnt + zeroCnt == 2) {
//				answer[0] = 5;
//			} else {
//				answer[0] = 6;
//			}
//			answer[1] = 7 - winCnt;
//		}

		return answer;
	}

	public int getGrade(int n) {
		switch (n) {
			case 6:
				return 1;
			case 5:
				return 2;
			case 4:
				return 3;
			case 3:
				return 4;
			case 2:
				return 5;
			default:
				return 6;
		}
	}
}
