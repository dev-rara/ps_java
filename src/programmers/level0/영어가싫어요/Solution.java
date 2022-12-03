package programmers.level0.영어가싫어요;

public class Solution {

	public long solution(String numbers) {
		String[] alphabet = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

		for (int i = 0; i < alphabet.length; i++) {
			numbers = numbers.replace(alphabet[i], String.valueOf(i));
		}

		return Long.parseLong(numbers);
	}
}
