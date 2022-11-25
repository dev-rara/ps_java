package programmers.level0.외계행성의나이;

public class Solution {

	public String solution(int age) {
		StringBuilder answer = new StringBuilder();
		String[] word = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

		while (age > 0) {
			answer.insert(0, word[age % 10]);
			age /= 10;
		}
		return answer.toString();
	}
}
