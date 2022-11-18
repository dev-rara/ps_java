package algorithm_study._2016년;

import java.util.Calendar;

public class Solution {

	public String solution(int a, int b) {
		String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int date = 0;
		for (int i = 0; i < a - 1; i++) {
			date += month[i];
		}
		date += b - 1;

		return day[date % 7];


		//Calendar를 이용한 풀이
//		String answer = "";
//		Calendar cal = Calendar.getInstance();
//		cal.set(2016, a - 1, b);
//		int day = cal.get(Calendar.DAY_OF_WEEK);
//		switch (day){
//			case 1:
//				answer = "SUN";
//				break;
//			case 2:
//				answer = "MON";
//				break;
//			case 3:
//				answer = "TUE";
//				break;
//			case 4:
//				answer = "WED";
//				break;
//			case 5:
//				answer = "THU";
//				break;
//			case 6:
//				answer = "FRI";
//				break;
//			case 7:
//				answer = "SAT";
//				break;
//		}
//		return answer;
	}
}
