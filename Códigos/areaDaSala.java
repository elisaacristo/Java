import java.util.Scanner;
public class AreaDaSala {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double lar1, lar2, area;

		lar1 = in.nextDouble();
		lar2 = in.nextDouble();
		area = lar1 * lar2;

		System.out.println("A área é de " + area + "m²");

	}
}
