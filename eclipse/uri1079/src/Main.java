import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			
			for (int cont = 0; cont < N; cont++) {
				
				double v1 = sc.nextDouble();
				double v2 = sc.nextDouble();
				double v3 = sc.nextDouble();
				
				v1 = v1 * 2 / 10;
				v2 = v2 * 3 / 10;
				v3 = v3 * 5 / 10;
				
				double media = v1 + v2 + v3;
				
				System.out.printf("%.1f%n", media);
		
			}
		sc.close();
	}

}
