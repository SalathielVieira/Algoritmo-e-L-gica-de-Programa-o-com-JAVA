import java.util.*;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			int t, vm;
			double lt;
			
			t = sc.nextInt();
			vm = sc.nextInt();
			
			lt = (double) (vm * t) / 12;
			
			System.out.printf("%.3f%n", lt);
		
		
		sc.close();
	}

}
