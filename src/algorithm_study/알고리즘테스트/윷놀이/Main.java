package algorithm_study.알고리즘테스트.윷놀이;

public class Main {
	public String solution(int[] arr1) {
		String answer = "";
		int zeroCnt = 0;

		for(int num : arr1) {
			if (num == 0) {
				zeroCnt++;
			}
		}

		switch (zeroCnt) {
			case 0:
				answer = "모";
				break;
			case 1:
				answer = "도";
				break;
			case 2:
				answer = "개";
				break;
			case 3:
				answer = "걸";
				break;
			case 4:
				answer = "윳";
				break;
		}
		return answer;
	}

	public static void main(String[] args) {
		Main method = new Main();
		int[] arr1 = {0,1,0,0};
		System.out.println(method.solution(arr1));
	}
}
