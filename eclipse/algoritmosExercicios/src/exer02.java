import java.util.Locale;
import java.util.Scanner;

public class exer02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			double SA = sc.nextDouble();
			double NS;
			
			if (SA < 500.0) {
				NS = SA * 1.15;
			} else if (SA <= 1000.0) {
				NS = SA * 1.10;
			} else {
				NS = SA * 1.05;
			}
			
			System.out.println((NS));
		
		sc.close();
	}

}
