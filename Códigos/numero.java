import java.util.*;
public class Numero {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		double n;

		System.out.println("Insira o número: ");
		n = in.nextDouble();

		if (n == 0) {
			System.out.println("Número neutro");
		} else if (n < 0) {
			System.out.println("Número negativo");
		} else {
			System.out.println("Número positivo");
		}

	}
}
