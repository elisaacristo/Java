import java.util.*;
public class vacinometro {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		
		float N;
		N = in.nextFloat();
		
		float V;
		V = in.nextFloat();
		
		V = 100 * V;
		float g;
		g = V/N;
		
		System.out.printf("%.1f%%\n", (g));
	}
}
