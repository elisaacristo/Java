import java.util.Scanner;
public class Preco {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);

		String r = "";
		double preco, venda, margem;

		while (!(r.equalsIgnoreCase("n") || r.equalsIgnoreCase("nao") || r.equalsIgnoreCase("não"))) {

			System.out.println("\nDigite o preço do produto: ");
			preco = in.nextDouble();
			System.out.println("Digite a margem de lucro (%): ");
			margem = in.nextDouble();

			margem = preco / 100 * margem;
			venda = preco + margem;

			System.out.printf("\nSeu preço de venda deve ser de: %.2f \n", venda);
			System.out.println("\nDeseja continuar a execução? (S/N)");
			r = in.next();
		}
	}
}
