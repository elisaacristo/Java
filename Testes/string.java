import java.util.*;
public class String {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
//    String ola = "teste 12345678";
//		String texto = "Hello, World!";
//		System.out.println(texto.getChars(2, 4, ola, 5));

		String myStr = "Hello planet earth, you are a great planet.";
		
		System.out.println(myStr.indexOf(","));
		System.out.println(myStr.length());
		
		String[] novo = myStr.split("[,\\.\\s]");
		
		for (int i=0; i<novo.length; i++){
			System.out.println(novo[i]);
		}
	}
}
