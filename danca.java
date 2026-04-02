import java.util.Scanner;
public class danca {
	public static void main (String[] args){ 
		Scanner in = new Scanner(System.in);
		
		int linhas, colunas, passos, alunos=0, a, b;
		String ordem;
		linhas = in.nextInt();
		colunas = in.nextInt();
		passos = in.nextInt();
		
		int[][] matriz = new int[linhas][colunas];
		
		if (linhas >= 1 && linhas <= 1000000) {
			if (colunas >= 1 && colunas <= 1000000) {
				if ((linhas*colunas) <= 1000000) {
					if (passos <= 500000) {
						for (int i=0; i<linhas; i++) {
							for (int j=0; j<colunas; j++) {
								alunos = alunos+1;
								matriz[i][j] = alunos;
								}
							}
						for (int p=0; p<passos; p++) {
							ordem = in.next();
							a = in.nextInt();
							b = in.nextInt();
							a = a-1;
							b = b-1;

							if (ordem.equalsIgnoreCase("c")) {
								for (int i=0; i<linhas; i++) {
									for (int j=0; j<colunas; j++) {
										if (j == a || j == b) {
											int aux = matriz[i][a];
											matriz[i][a] = matriz[i][b];
											matriz[i][b] = aux;
											}
										}
									}
								}
							else if (ordem.equalsIgnoreCase("l")) {
								for (int i=0; i<linhas; i++) {
									for (int j=0; j<colunas; j++) {
										if (i == a || i == b) {
											int auzz = matriz[a][j];
											matriz[a][j] = matriz[b][j];
											matriz[b][j] = auzz;
										}
									}
								}
							}
						}
					}
						for (int i=0; i<linhas; i++) {
							for (int j=0; j<colunas; j++) {
								System.out.println(matriz[i][j]);
							}
						}
					}
				}
			}
		}
	}

//if (ordem.equalsIgnoreCase("l") || ordem.equalsIgnoreCase("c")) {
//if ((ordem.equalsIgnoreCase("l") && mudal >= 1 && mudal <= linhas && mudac >= 1 && mudac <= linhas) || (ordem.equalsIgnoreCase("c") && mudal >= 1 && mudal <= colunas && mudac >= 1 && mudac <= colunas)) {
	//if (a != b) {
		//}
	//}
//}
