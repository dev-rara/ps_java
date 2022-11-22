package algorithm_study.모의고사문제풀이;

import java.util.ArrayList;

public class Practice03 {

	public String solution(String s) {
		StringBuilder answer = new StringBuilder();
		String[] strArray = s.split(" ");

		ArrayList<Integer> primeList = new ArrayList<>();
		ArrayList<Integer> noPrimeList = new ArrayList<>();

		for (int i = 0; i < strArray.length; i++) {
			if (!checkNumber(strArray[i])) {
				noPrimeList.add(Integer.parseInt(strArray[i]));
			} else {
				primeList.add(Integer.parseInt(strArray[i]));
			}
		}

		int maxNumber = Integer.MIN_VALUE;
		int minNumber = Integer.MAX_VALUE;

		for (int noPrime: noPrimeList) {
			minNumber = Math.min(minNumber, noPrime);
		}
		answer.append(minNumber);
		answer.append(" ");

		for (int prime: primeList) {
			maxNumber = Math.max(maxNumber, prime);
		}
		answer.append(maxNumber);

		return answer.toString();
	}

	public boolean checkNumber(String num) {
		int number = Integer.parseInt(num);
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Practice03 method = new Practice03();
		String s1 = "97 75 88 99 95 92 73";
		String s2 = "2 3 4 5";
		String s3 = "15 3 10 9 7 8";

		System.out.println(method.solution(s1));
		System.out.println(method.solution(s2));
		System.out.println(method.solution(s3));
	}
}
