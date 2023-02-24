package programmers.level0.치킨쿠폰;

public class Solution {
	public int solution(int chicken) {
		int answer = 0;
		int coupon = chicken;

		while(coupon >= 10) {
			int left = coupon % 10;
			answer += coupon / 10;
			coupon = left + (coupon / 10);
		}
		return answer;
	}
}
