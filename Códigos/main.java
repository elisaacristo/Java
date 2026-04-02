import java.util.*;
public class main {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		
		int cr;
		cr = in.nextInt();
		
		int A, B, C;
		int sobra = 0;
		
		A = in.nextInt();
		B = in.nextInt();
		C = in.nextInt();
		
		int soma=0;
		
		
		if ((A+C+B) % cr == 0) {
			System.out.print("ABC");
			soma = A + B + C;
		}
		else if ((A+B) % cr == 0) {
			System.out.print("AB");
			soma = A + B;
		}
		else if ((A+C) % cr == 0) {
			System.out.print("AC");
			soma = A + C;
		}
		else if ((C+B) % cr == 0) {
			System.out.print("BC");
			soma = B + C;
		}
		else if (A % cr == 0) {
			System.out.print("A");
			soma = A;
		}
		else if (B % cr == 0) {
			System.out.print("B");
			soma = B;
		}
		else if (C % cr == 0) {
			System.out.print("C");
			soma = C;
		}else {
			System.out.print("NENHUMA");
		}
		
		System.out.print("\n");
		System.out.println(soma);
	}
}
