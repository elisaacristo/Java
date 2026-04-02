import java.util.*;
public class MiniQuiz {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);

		String nome;
		int r1, r2, r3;

		System.out.print("Bem vindo(a) ao mini quiz de matemática! \n \n Por favor digite seu nome: ");
		nome = ler.next();

		System.out.println("\nVamos começar... \n \n Primeira pergunta: \nO dobro de um número é igual a 10+4. Que número é esse?\nResposta: ");
		r1 = ler.nextInt();

		System.out.println("\n Ok, a próxima pergunta é: \nQuanto é o triplo de 11?\nResposta: ");
		r2 = ler.nextInt();

		System.out.println("\n Agora vamos para a última pergunta: \nQual é a raiz quadrada de 9?");
		r3 = ler.nextInt();

		if (r1 == 7 && r2 != 33 && r3 != 3) {
			System.out.println("\n" + nome + ", você acertou 1/3!");
		}

		else if (r1 != 7 && r2 == 33 && r3 != 3) {
			System.out.println("\n" + nome + ", você acertou 1/3!");
		}

		else if (r1 != 7 && r2 != 33 && r3 == 3) {
			System.out.println("\n" + nome + ", você acertou 1/3!");
		}

		else if (r1 == 7 && r2 == 33 && r3 != 3) {
			System.out.println("\n" + nome + ", você acertou 2/3!");
		}

		else if (r1 != 7 && r2 == 33 && r3 == 3) {
			System.out.println("\n" + nome + ", você acertou 2/3!");
		}

		else if (r1 == 7 && r2 != 33 && r3 == 3) {
			System.out.println("\n" + nome + ", você acertou 2/3!");
		}

		else if (r1 == 7 && r2 == 33 && r3 == 3) {
			System.out.println("\nParabéns " + nome + "! Você acertou 3/3!");
		}

		else if (r1 != 7 && r2 != 33 && r3 != 3) {
			System.out.println("\nDesculpe, mas você não obteve acertos :'(");
		}

	}
}
