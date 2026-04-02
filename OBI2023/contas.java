import java.util.*;
public class ContasOBI{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		
		int contasPagas = 0;
		ArrayList<Integer> contas = new ArrayList();
		int v = in.nextInt();
		int a = in.nextInt();
		int f = in.nextInt();
		int p = in.nextInt();
		
		contas.add(a);
		contas.add(f);
		contas.add(p);
		
		System.out.println(contas);
		
		contas.sort(Comparator.naturalOrder());
		
		System.out.println(contas);
		
		for (int i=0; i<contas.size(); i++){
			if (v >= contas.get(i)){
				v = v - contas.get(i);
				contasPagas = contasPagas + 1;
			}
		}
		System.out.printf("%d", contasPagas);
	}
}
