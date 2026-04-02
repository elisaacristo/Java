import java.util.*;
public class Temperatura {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		double fah, cel;

		System.out.println("Digite a temperatura em Fahrenheit: ");
		fah = ler.nextDouble();

		cel = (fah - 32) / 1.8;
		System.out.println("Temperatura em Celsius: " + cel);

		if (cel < 15) {
			System.out.println("Temperatura: fria");
		} else if (cel >= 15 && cel < 22) {
			System.out.println("Temperatura: amena");
		} else {
			System.out.println("Temperatura: quente");
		}
	}
}
