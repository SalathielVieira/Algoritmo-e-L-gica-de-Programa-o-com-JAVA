import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
			int codpc1, codpc2, qtdpc1, qtdpc2;
			double vlrpc1, vlrpc2, vlrpg;
			
			codpc1 = sc.nextInt();
			qtdpc1 = sc.nextInt();
			vlrpc1 = sc.nextDouble();
			
			codpc2 = sc.nextInt();
			qtdpc2 = sc.nextInt();
			vlrpc2 = sc.nextDouble();
			
			vlrpg = (qtdpc1*vlrpc1) + (qtdpc2*vlrpc2);
			
			System.out.printf("VALOR A PAGAR: R$ %.2f%n", vlrpg);
		
		
		sc.close();

	}

}
