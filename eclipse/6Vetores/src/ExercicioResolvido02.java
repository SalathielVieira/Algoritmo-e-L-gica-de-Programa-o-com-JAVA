import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double [] vet = new double[N];
		double soma = 0.0;
		double media = 0.0;
		
		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < N; i++) {
			System.out.printf("%.1f ", vet[i]);
			soma += vet[i];
		}
		System.out.println();
		System.out.printf("%.2f%n",soma);
		media = soma / N;
		System.out.printf("%.2f%n", media);
		sc.close();
	}

}
