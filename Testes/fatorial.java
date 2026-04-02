import java.util.*;
public class Fatorial {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);

		int i = 1, n, r = 1;

		System.out.println("Digite o número para ser fatorado: ");
		n = in.nextInt();

		if (n >= 0) {
			do {
				r = r * i;
				i++;
			} while (i <= n);
			System.out.println(n + "! = " + r);
		} else {
			System.out.println("Digite somente números positivos!");
		}
	}
}
