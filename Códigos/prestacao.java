import java.util.Scanner;
public class Prestacao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double valor, taxa, pres;
		int tempo;

		valor = in.nextDouble();
		taxa = in.nextDouble();
		tempo = in.nextInt();
		pres = valor + (valor * (taxa / 100) * tempo);

		System.out.println("Sua prestação é R$" + pres);

	}
}
