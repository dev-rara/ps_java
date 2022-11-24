package algorithm_study.알고리즘모의고사.신대륙발견;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
	public String solution(int month, int day) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("M월 d일");

		Calendar cal = Calendar.getInstance();
		cal.set(2022, month - 1, day);
		cal.add(Calendar.DATE, 98);

		return dateFormat.format(cal.getTime());
	}

	public static void main(String[] args) {
		Main method = new Main();
		System.out.println(method.solution(1, 18));
		System.out.println(method.solution(11, 27));
		System.out.println(method.solution(6, 22));
	}
}
