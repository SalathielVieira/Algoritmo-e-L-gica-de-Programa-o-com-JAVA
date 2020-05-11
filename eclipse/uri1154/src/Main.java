import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
			int idade = sc.nextInt();
			int somaIdade = 0;
			double mediaIdades;
			int contador = 0;
			
			while (idade >= 0) {
				somaIdade += idade;
				contador ++;
				idade = sc.nextInt();
			}
			
			mediaIdades = (double)somaIdade / contador;
			
			System.out.printf("%.2f%n", mediaIdades);
			
		sc.close();
	}

}
