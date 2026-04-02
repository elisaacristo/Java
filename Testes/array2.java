import java.util.*;
public class Array2{
	public static void main (String[]args){
		Scanner in = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList();
		
		nomes.add("elisa");
		nomes.add("diniz");
		nomes.add("dudu");
		nomes.add("oii");
		nomes.add("anna");
		
		System.out.println(nomes);
		
		nomes.sort(Comparator.naturalOrder());
		
		System.out.println(nomes);
		
		nomes.sort(Comparator.reverseOrder());
		
		System.out.println(nomes);
		
		nomes.remove(2);
		
		System.out.println(nomes);
		
		nomes.clear();
		
		System.out.println(nomes);
	}
}
