import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
			int distancia;
			float combustivel;
			double consumo;
			
			distancia = sc.nextInt();
			combustivel = sc.nextFloat();
			consumo = distancia / combustivel;
			
			System.out.printf("%.3f km/l%n", consumo);
			
		sc.close();

	}

}
