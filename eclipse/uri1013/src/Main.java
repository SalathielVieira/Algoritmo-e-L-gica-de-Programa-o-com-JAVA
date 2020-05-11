import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
			int a, b, c, m1, maior;
			
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			m1 = (a + b + Math.abs(a-b)) / 2;
			
			maior = (m1 + c + Math.abs(m1-c)) / 2;
			
			System.out.println(maior + " eh o maior");
		
		
		sc.close();
				
	}

}
