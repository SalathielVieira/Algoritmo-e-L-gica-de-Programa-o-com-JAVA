import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		double salario = sc.nextDouble();
		double Nsalario;
		double reajuste;
		double percentual;
		
		if (salario <= 400.00) {
			percentual = 15.0;
		}
		else if (salario <= 800.00) {
			percentual = 12.0;
		}
		else if (salario <= 1200.00) {
			percentual = 10.0;
		}
		else if (salario <= 2000.00) {
			percentual = 7.0;
		}
		else {
			percentual = 4;
		}
		
		reajuste = salario * percentual / 100;
		Nsalario = salario + reajuste;
		
		System.out.printf("Novo salario: %.2f%n", Nsalario);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.printf("Em percentual: %.0f %%%n", percentual);
		sc.close();
	}

}
