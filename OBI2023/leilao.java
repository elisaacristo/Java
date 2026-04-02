import java.util.*;
public class LeilaoOBI {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		String[] nomes = new String[n];
		int[] valores = new int[n];
		int maiorValor = 0, index = 0;
		
		for (int i=0; i<n; i++){
			nomes[i] = in.next();
			valores[i] = in.nextInt();
			
			if (valores[i] > maiorValor){
				maiorValor = valores[i];
				index = i;
			}
		}
		System.out.println(nomes[index]);
		System.out.println(valores[index]);
	}
}
