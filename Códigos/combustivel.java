import java.util.*;
public class combustivel {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		
		float V;
		V = in.nextFloat();
		
		float T;
		T = in.nextFloat();
		
		if (V*0.7 > T) {
			System.out.println("ETANOL");
		}
		else {
				System.out.println("GASOLINA");
			}
		}
	}
