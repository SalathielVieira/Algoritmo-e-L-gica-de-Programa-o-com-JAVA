import java.util.*;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double R, volume;
		
		R = sc.nextDouble();
		volume = (4/3.0) * 3.14159 * Math.pow(R,3);

		System.out.printf("VOLUME = %.3f%n", volume);
		
		
		sc.close();

	}
}