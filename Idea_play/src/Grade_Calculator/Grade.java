package Grade_Calculator;

public class Grade {
	private double A_p = 4.5;
	private double A = 4.0;
	private double B_p = 3.5;
	private double B = 3.0;
	private double C_p = 2.5;
	private double C = 2.0;

	public void grade(int A_p, int A, int B_p, int B, int C_p, int C) {
		Cal(A_p, A, B_p, B, C_p, C);
	}

	private void Cal(int A_p, int A, int B_p, int B, int C_p, int C) {
		double sum = (this.A_p * A_p + this.A * A + this.B_p* B_p + this.B* B + this.C_p * C_p + this.C * C);
		double cnt = A_p + A + B_p + B + C_p + C;
		double result = sum / cnt;
		System.out.println(result);
		System.out.println(cnt +"과목");
	}

}
