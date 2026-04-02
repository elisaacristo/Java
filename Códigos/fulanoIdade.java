import java.util.Scanner;
public class FulanoIdade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome;
		int idade;

		nome = in.next();
		idade = in.nextInt();

		System.out.println("" + nome + ", você tem " + idade + " anos.");
	}
}
