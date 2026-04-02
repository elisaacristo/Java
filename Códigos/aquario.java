import java.util.Scanner;
public class aquario {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		
		double N, O, P, S;
		double A, B, C;
		
		N = in.nextInt();
		O = in.nextInt();
		P = in.nextInt();
		S = in.nextInt();
		
		A = (N*O*P)/1000;
		System.out.printf("%.1fLTS\n", (A));
		
		B = (N*O*S)/1000;
		System.out.printf("%.1fKG\n", (B));
		
		C = (A*3)*0.05;
		System.out.printf("%.1fML\n", (C));
	}
}
