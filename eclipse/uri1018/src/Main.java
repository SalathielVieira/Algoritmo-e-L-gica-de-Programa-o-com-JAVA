import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, resto, n100, n50, n20, n10, n5, n2, n1;		
				
		N = sc.nextInt();
		
		n100 = N / 100;
		resto = N % 100;
		
		n50 = resto / 50;
		resto = resto % 50;
				
		n20 = resto / 20;
		resto = resto % 20;
				
		n10 = resto / 10;
		resto = resto % 10;
				
		n5 = resto / 5;
		resto = resto % 5;
				
		n2 = resto / 2;
		resto = resto % 2;
				
		n1 = resto / 1;
		
		System.out.println(N);
		System.out.println(n100 + " nota(s) de R$ 100,00");
		System.out.println(n50 + " nota(s) de R$ 50,00");
		System.out.println(n20 + " nota(s) de R$ 20,00");
		System.out.println(n10 + " nota(s) de R$ 10,00");
		System.out.println(n5 + " nota(s) de R$ 5,00");
		System.out.println(n2 + " nota(s) de R$ 2,00");
		System.out.println(n1 + " nota(s) de R$ 1,00");
		
		sc.close();

	}

}
