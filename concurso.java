import java.util.*;
public class concurso {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int K = in.nextInt();
		ArrayList<Integer> A = new ArrayList();;
		int i;
		
		for (i=0; i<N; i++) {
			A.add(in.nextInt());
		}
		
		A.sort(Comparator.reverseOrder());
		System.out.println(A.get(K-1));
	}
}
