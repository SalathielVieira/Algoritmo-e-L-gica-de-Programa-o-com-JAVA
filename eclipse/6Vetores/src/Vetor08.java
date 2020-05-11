import java.util.Locale;
import java.util.Scanner;

public class Vetor08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			double[] altura = new double[N];
			String[] sexo = new String[N];
			double somaAltura = 0.0;
			double mediaAltura = 0.0;
			int numMulheres = 0;
			double maiorAltura = 0.0;
			int numHomens = 0;
		//Entrada de dados	
			for (int cont = 0; cont < N; cont++) {
				altura[cont] = sc.nextDouble();
				sexo[cont] = sc.next();
			}
		//Cálculos
			double menorAltura = altura[0];
			for (int cont = 0; cont < N; cont++) {
				if (menorAltura > altura[cont]) {
					menorAltura = altura[cont];
				}
				if (maiorAltura < altura[cont]) {
					maiorAltura = altura[cont];
				}
				if (sexo[cont].equals("F")) {
					somaAltura += altura[cont];
					numMulheres++;
				} else if (sexo[cont].equals("M")) {
					numHomens++;
				}
			}
			mediaAltura = somaAltura / numMulheres;
		//Saída dos dados
			System.out.printf("Menor altura = %.2f%n", menorAltura);
			System.out.printf("Maior altura = %.2f%n", maiorAltura);
			System.out.printf("Média das alturas das mulheres = %.2f%n", mediaAltura);
			System.out.printf("Número de homens = %d%n", numHomens);
			
		sc.close();
	}

}
