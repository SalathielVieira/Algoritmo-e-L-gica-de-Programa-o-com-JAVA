import java.util.Locale;
import java.util.Scanner;

public class Vetor04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			double[] vet = new double[N];
			double soma = 0.0;
			double media = 0.0;
		//Entrada dos dados
			for (int cont = 0; cont < N; cont++) {
				vet[cont] = sc.nextDouble();
				soma += vet[cont];
			}
		//Cálculo da média
			media = (double)soma / N;
			System.out.printf("%.3f%n", media);
		//Mostrando os números abaixo da média
			for (int cont = 0; cont < N; cont++) {
				if (vet[cont] < media) {
					System.out.printf("%.1f%n", vet[cont]);
				}
			}
		sc.close();
	}

}
