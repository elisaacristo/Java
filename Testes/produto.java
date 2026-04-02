import java.util.Scanner;
public class Produto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] num = new int[10];
		int i, maior, menor, prod;

		System.out.println("Digite um número inteiro: ");
		num[0] = in.nextInt();

		maior = num[0];
		menor = num[0];

		for (i = 1; i <= 9; i++) {
			System.out.println("Digite um número inteiro: ");
			num[i] = in.nextInt();

			if (num[i] > maior) {
				maior = num[i];
			}
			if (num[i] < menor) {
				menor = num[i];
			}
		}
		System.out.println("O maior valor é: "+maior);
		System.out.println("O menor valor é: "+menor);

		prod = maior * menor;

		System.out.println(maior + " X " + menor + " = " + prod);
	}
}
