import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
						
			double A = 0.0;
			double B = 0.0;
			double C = 0.0;
			
			double tPer = 0.0;
			double tArea = 0.0;
						
			if (n1 > n2 && n1 > n3) {
				A = n1;
				if (n2 > n3) {
					B = n2;
					C = n3;
				} else {
					B = n3;
					C = n2;
				}
			}
			if (n2 > n1 && n2 > n3) {
				A = n2;
				if (n1 > n3) {
					B = n1;
					C = n3;
				} else {
					B = n3;
					C = n1;
				}
			}
			if (n3 > n1 && n3 > n2) {
				A = n3;
				if (n1 > n2) {
					B = n1;
					C = n2;
				} else {
					B = n2;
					C = n1;
				}
			}
						
			if (A >= B + C) {
				tArea = (A + B) * C / 2;
				System.out.printf("Area = %.1f%n", tArea);
				
			} else {
				tPer = A + B + C;
				System.out.printf("Perimetro = %.1f%n", tPer);
			}
								
		sc.close();
	}

}
