import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		double total = 0;
		
		switch (cod) {
		case 1: 
			total = qtd * 4.00;
			break;
		case 2:
			total = qtd * 4.50;
			break;
		case 3:
			total = qtd * 5.00;
			break;
		case 4:
			total = qtd * 2.00;
			break;
		case 5:
			total = qtd * 1.50;
		}
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}

}
