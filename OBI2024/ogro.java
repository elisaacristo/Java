import java.util.*;
public class ogro {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int E = in.nextInt();
		int D = in.nextInt();
		int resul;
		
		if ((E >= 0 && E <= 5) && (D >= 0 && D <= 5) && (E != D)) {
			if (E > D) {
				System.out.println(E + D);
			}
			else {
				System.out.println(2 * (D-E));
			}
		}
	}
}
