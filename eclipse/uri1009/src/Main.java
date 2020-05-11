import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			String nome;
		
			double sFixo, tVendas, tSalario;
			
			nome = sc.next();
			sFixo = sc.nextDouble();
			tVendas = sc.nextDouble();
			tSalario = (tVendas*0.15)+sFixo;
			
			System.out.printf("TOTAL = R$ %.2f%n", tSalario);
			
		
		sc.close();

	}

}
