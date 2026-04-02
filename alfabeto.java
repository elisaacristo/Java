import java.util.Scanner;
public class alfabeto {
	public static void main (String[] args){ 
		Scanner in = new Scanner(System.in);
		
		String ufa = "teste";
		int numAlfa = in.nextInt();
		int numMsg = in.nextInt();
		String alfa = in.next();
		String[] alfa2 = alfa.split("");
		String msg = in.next();
		String[] msg2 = msg.split("");
		int[] resp = new int[numMsg];
		
		if (numAlfa >= 1 && numAlfa <= 68) {
			if (numAlfa >= 1 && numMsg <= 1000) {
				if (alfa.length() <= numAlfa) {
					if (msg.length() <= numMsg) {
						for (int i=0; i<msg.length(); i++) {
							for (int j=0; j<alfa.length(); j++) {
								if (msg2[i].equals(alfa2[j])) {
									resp[i] = 1;
									break;
								} else {
									resp[i] = 0;
									continue;
								}
							}
						}
						for (int a=0; a<resp.length; a++) {
							if (resp[a] == 0) {
								ufa = "N";
								break;
							} else {
								ufa = "S";
							}
						} System.out.println(ufa);
					}
				}
			}
		}
	}
}
