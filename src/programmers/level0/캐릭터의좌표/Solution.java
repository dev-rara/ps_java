package programmers.level0.캐릭터의좌표;

public class Solution {

	public int[] solution(String[] keyinput, int[] board) {
		int[][] direction = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};   //up, down, left, right
		int[] answer = {0, 0};

		for (String s : keyinput) {
			switch (s) {
				case "up":
					answer[1] += direction[0][1];
					if (answer[1] >= board[1] / 2) {
						answer[1] = board[1] / 2;
					}
					break;
				case "down":
					answer[1] += direction[1][1];
					if (answer[1] <= -(board[1] / 2)) {
						answer[1] = -(board[1] / 2);
					}
					break;
				case "left":
					answer[0] += direction[2][0];
					if (answer[0] <= -(board[0] / 2)) {
						answer[0] = -(board[0] / 2);
					}
					break;
				default:
					answer[0] += direction[3][0];
					if (answer[0] >= board[0] / 2) {
						answer[0] = board[0] / 2;
					}
					break;
			}
		}

		return answer;
	}
}
