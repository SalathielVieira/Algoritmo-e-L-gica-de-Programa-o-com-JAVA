import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double nota = 0.0;
		double soma = 0.0;
		int cont = 1;
		
		while (cont <= 2) {
			nota = sc.nextDouble();
			if (nota > 0.0 && nota <=10.0) {
				soma += nota;
				cont ++;
			}
			else {
				System.out.println("nota invalida");
			}
			
		}
		double media = soma / 2.0;
		System.out.printf("media = %.2f%n", media);
		
		
		sc.close();
	}

}
