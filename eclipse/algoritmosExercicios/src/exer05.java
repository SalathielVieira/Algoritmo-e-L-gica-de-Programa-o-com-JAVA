import java.util.*;

public class exer05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			double N = sc.nextDouble();
			double R;
			
			if (!(N < 0)) {
				if (N != 5) {
					R = Math.sqrt(N);
					System.out.println("O resultado é " + R);
				}
				else {
					R = N / N / N;
					System.out.println("O resultado é " + R);
				}
			}	
			else {
				System.out.println("Não é possível!");
			
			}
				
		
		sc.close();
	}

}
