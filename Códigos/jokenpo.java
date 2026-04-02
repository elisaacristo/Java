import java.util.*;
public class jokenpo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String j1;
		j1 = in.next();
		
		String j2;
		j2 = in.next();
		
		if ((j1.equals("pedra")) && (j2.equals("papel"))) {
			System.out.println("Jogador 2");
		}
		if ((j1.equals("pedra")) && (j2.equals("tesoura"))) {
			System.out.println("Jogador 1");
		}
		if ((j1.equals("pedra")) && (j2.equals("pedra"))) {
			System.out.println("Empate");
		}
		if ((j1.equals("papel")) && (j2.equals("pedra"))) {
			System.out.println("Jogador 1");
		}
		if ((j1.equals("papel")) && (j2.equals("tesoura"))) {
			System.out.println("Jogador 2");
		}
		if ((j1.equals("papel")) && (j2.equals("papel"))) {
			System.out.println("Empate");
		}
		if ((j1.equals("tesoura")) && (j2.equals("pedra"))) {
			System.out.println("Jogador 2");
		}
		if ((j1.equals("tesoura")) && (j2.equals("papel"))) {
			System.out.println("Jogador 1");
		}
		if ((j1.equals("tesoura")) && (j2.equals("tesoura"))) {
			System.out.println("Empate");
		}
	}
}
