import java.util.*;
public class cubo {
	public static void main (String[] args){ 
		Scanner in = new Scanner(System.in);
		
		int n;
		n = in.nextInt();
		
		if (n >= 2 && n <= 100) {
			double f0 = Math.pow(n-2, 3);
			double f1 = Math.pow(n-2,2)*6;
			int f2 = (n-2)*12;
			int f3 = 8;
			
			System.out.println((int)f0);
			System.out.println((int)f1);
			System.out.println(f2);
			System.out.println(f3);
		}
	}
}
