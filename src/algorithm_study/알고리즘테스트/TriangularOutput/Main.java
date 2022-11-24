package algorithm_study.알고리즘테스트.TriangularOutput;

public class Main {

	public void solution(int star) {

		for (int i = 0; i < star; i++) {
			for (int j = 0; j < star - 1 - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Main method = new Main();
		int star = 9;
		method.solution(star);
	}
}
