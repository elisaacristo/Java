import java.util.Scanner;
public class SalarioMinimo {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		double sal;

		sal = in.nextDouble();

		if (sal < 1045) {
			System.out.println("Valor abaixo do salário mínimo");
		}

		else {
			System.out.println("Valor acima do salário mínimo");
		}

	}
}
