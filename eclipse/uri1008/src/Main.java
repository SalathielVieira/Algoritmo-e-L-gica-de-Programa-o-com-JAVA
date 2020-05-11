import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			int nFun, hTrab;
			double sHor, salario;
			
			nFun = sc.nextInt();
			hTrab = sc.nextInt();
			sHor = sc.nextDouble();
			salario = hTrab * sHor;
			
			System.out.println("NUMBER = " + nFun);
			System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}

}
