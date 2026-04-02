import java.util.Scanner;
public class MediaAritmetica {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double nota1, nota2, nota3, nota4, media;

		nota1 = in.nextDouble();
		nota2 = in.nextDouble();
		nota3 = in.nextDouble();
		nota4 = in.nextDouble();
		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("Sua média aritmética é "+media);

	}
}
