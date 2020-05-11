import java.util.Scanner;

public class Vetor06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			String[] nome = new String[N];
			int[] idade = new int[N];
			String maisVelho = "";
			int maiorIdade = 0;
		//Entrada de dados
			for (int cont = 0; cont < N; cont++) {
				nome[cont] = sc.next();
				idade[cont] = sc.nextInt();
			}
		//Separando a pessoa mais velha
			for (int cont = 0; cont < N; cont++) {
				if (idade[cont] > maiorIdade) {
					maisVelho = nome[cont];
					maiorIdade = idade[cont];
				}
			}
			System.out.println("Pessoa mais velha: "+maisVelho+" com "+maiorIdade+" anos.");
		sc.close();
	}

}
