import java.util.*;
public class LeilaoOBI2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int maiorValor = 0;
		String nomeVenc = "";
		
		for (int i=0; i<n; i++){
			String nome = in.next();
			int valor = in.nextFloat();
			
			if (valor > maiorValor){
				maiorValor = valor;
				nomeVenc = nome;
			}
		}
		System.out.println(nomeVenc);
		System.out.println(maiorValor);
	}
}
