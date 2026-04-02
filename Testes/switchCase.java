import java.util.*;
public class SwitchCase {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Numero de 1 a 5");
		int num = in.nextInt();
		
		switch (num) {
			case 1:
				System.out.println("Vc escolheu 1");
				break;
			case 2: 
				System.out.println("Vc escolheu 2");
				break;
			case 3:
				System.out.println("Vc escolheu 3");
				break;
			case 4:
				System.out.println("Vc escolheu 4");
				break;
			case 5: 
				System.out.println("Vc escolheu 5");
				break;
			default: 
				System.out.println(":(");
				break;
		}
	}
}
