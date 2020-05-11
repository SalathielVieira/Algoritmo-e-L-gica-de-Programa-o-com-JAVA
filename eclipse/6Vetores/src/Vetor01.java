import java.util.Locale;
import java.util.Scanner;

public class Vetor01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			double[] nReais = new double[N];
			double maior = 0.0;
			int pos = 0;
			
			
			for (int cont = 0; cont < N; cont++) {
				nReais[cont] = sc.nextDouble();
			}
			
			for (int cont = 0; cont < N; cont++) {
				if (nReais[cont] > maior) {
					maior = nReais[cont];
					pos = cont;
				}
			}

			System.out.printf("%.1f%n", maior);
			System.out.println(pos);

			sc.close();
	}

}
