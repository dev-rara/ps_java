package algorithm_study.숫자문자열과영단어;

public class Solution {

	public int solution(String s) {

		if (!s.matches(".*[a-zA-z].*")) {
			return Integer.parseInt(s);
		}

		String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

		for (int i = 0; i < word.length; i++) {
			for (int j = 0; j < number.length; j++) {
				if (s.contains(word[i])) {
					s = s.replace(word[i], number[i]);
				}
			}
		}

		return Integer.parseInt(s);
	}

}
