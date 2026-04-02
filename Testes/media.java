import java.util.Scanner;
public class Media {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] nome  = new String[8];
		double[] nota = new double[8];
		double media = 0, not;
		String nom;

		for (int i = 0; i < nome.length; i++) {
			System.out.println("Digite seu nome: ");
			nome[i] = in.next();
			System.out.println("Digite sua nota: ");
			nota[i] = in.nextDouble();
		}
		for (int i = 0; i < nota.length; i++) {
			media = media + nota[i];
		}

		media = media / 8;

		System.out.printf("\nA média da turma é: %.2f \n", media);
		System.out.println("\nOs alunos com notas superiores à média da turma são:  \n");

		for (int i = 0; i <= 7; i++) {
			if (nota[i] > media) {
				nom = nome[i];
				not = nota[i];
				System.out.println(nom + ", nota: " + not);
			}
		}
	}
}
