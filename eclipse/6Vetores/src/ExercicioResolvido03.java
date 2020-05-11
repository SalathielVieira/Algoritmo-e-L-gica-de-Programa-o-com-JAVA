import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			String[] nomes = new String[N];
			int[] idades = new int[N];
			double[] alturas = new double[N];
			double altSoma = 0.0;
			double altMedia = 0.0;
			int qtdMenor = 0;
			double menor = 0.0;
			
			for (int c = 0; c < N; c++) {
				nomes[c] = sc.next();
				idades[c] = sc.nextInt();
				alturas[c] = sc.nextDouble();
			}
			for (int c = 0; c < N; c++) {
				altSoma = altSoma + alturas[c];
				if (idades[c] < 16) {
					qtdMenor++;
				}
			}
			menor = qtdMenor * 100.0 / N;
			altMedia = altSoma / N;
			
			System.out.printf("Altura média: %.2f.%n", altMedia);
			System.out.printf("Pessoas com menos de 16 anos: %.1f%%.%n", menor);
			
		sc.close();
	}

}
