package algorithm_study.문자열다루기기본;

public class Solution {

	public boolean solution(String s) {

		if (s.matches(".*[a-zA-Z].*")) {
			return false;
		} else {
			return s.length() == 4 || s.length() == 6;
		}
	}
}
