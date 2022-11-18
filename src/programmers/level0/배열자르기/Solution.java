package programmers.level0.배열자르기;

public class Solution {

	public int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = new int[num2 - num1 + 1];
		int j = 0;

		for (int i = num1; i <= num2; i++) {
			answer[j] = numbers[i];
			j++;
		}
		return answer;
	}

	public static void main(String[] args) {

	}
}
