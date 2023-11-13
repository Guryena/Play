package Grade_Calculator;

import java.util.Scanner;

public class Grade_calculator {

	public static void main(String[] args) {
		Grade grade = new Grade();
		Scanner scanner = new Scanner(System.in);

		System.out.println("A+ 갯수를 작성하시오");
		int A_p = scanner.nextInt();
		System.out.println("A 갯수를 작성하시오");
		int A = scanner.nextInt();
		System.out.println("B+ 갯수를 작성하시오");
		int B_p = scanner.nextInt();
		System.out.println("B 갯수를 작성하시오");
		int B = scanner.nextInt();
		System.out.println("C+ 갯수를 작성하시오");
		int C_p = scanner.nextInt();
		System.out.println("C 갯수를 작성하시오");
		int C = scanner.nextInt();

		grade.grade(A_p, A, B_p, B, C_p, C);
	}

}
