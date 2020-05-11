import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
			double n1, n2, MEDIA;
			
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			
			MEDIA = (n1 * 3.5 + n2 * 7.5) / 11.0;
			
			System.out.printf("MEDIA = %.5f%n", MEDIA);
			
		
		sc.close();

	}

}
