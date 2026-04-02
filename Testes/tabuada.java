import java.util.*;
public class Tabuada {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);

		int i, n, r;

		System.out.print("Tabuada do: ");
		n = in.nextInt();

		for (i = 1; i <= 10; i++) {

			r = n * i;
			System.out.println(i + " X " + n + " = " + r);

		}
	}
}
