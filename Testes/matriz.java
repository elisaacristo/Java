import java.util.*;
public class Matriz {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);

		int[][] mat = new int [4][4];
		int i, j, menZ, linMen = 0, maxMini;

		System.out.println("Preencha uma matriz 4x4 de números inteiros (sem repetições).");

		for (i = 0; i < 4; i++) {
			for (j = 0; j < mat.length; j++) {
				System.out.println("\nDigite um valor inteiro (" + (i + 1) + ", " + (j + 1) + "): ");
				mat[i][j] = in.nextInt();
			}
		}
		menZ = mat[0][0];

		for(i=0; i < 4; i++) {
			for (j=0; j < 4; j++) {
				System.out.print(mat[i][j] + "	");
			}
		       System.out.println("	");
		}
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				if (mat[i][j] < menZ) {
					menZ = mat[i][j];
					linMen = i;
				}
			}
		}
		maxMini = mat[linMen][0];

		for (j = 0; j < 4; j++) {
			if (mat[linMen][j] > maxMini) {
				maxMini = mat[linMen][j];
			}
		}
		System.out.println("\nO menor valor da matriz é: " + menZ + " \nA linha do menor valor é: " + (linMen + 1));
		System.out.println("O maior valor, da linha que contém o menor valor da matriz é: " + maxMini);
	}
}
