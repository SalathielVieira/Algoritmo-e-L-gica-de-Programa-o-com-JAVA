import java.util.Locale;
import java.util.Scanner;

public class Vetor05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int[] vet = new int[N];
			int sPares = 0;
			double media = 0.0;
			int div = 0;
		//Entrada dos valores
			for (int cont = 0;  cont < N;  cont++) {
				vet[cont] = sc.nextInt();
			}
		//Soma dos números pares
			for (int cont = 0; cont < N; cont++) {
				if (vet[cont] % 2 == 0) {
					sPares += vet[cont];
					div++;
				}
			}
		//Cálculo da média e exibição	
			media = (double)sPares / div;
			System.out.printf("%.1f%n", media);
		sc.close();
	}

}
