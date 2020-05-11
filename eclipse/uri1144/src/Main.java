import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			int N = sc.nextInt();
			int soma1, soma2, multiplicador, produto;
			
			for (int c1 = 1; c1 <= N; c1++) {
				multiplicador = c1 * c1;
				produto = c1 * multiplicador;
				System.out.printf("%d %d %d%n", c1, multiplicador, produto);
				
				soma1 = multiplicador + 1;
				soma2 = produto + 1;
				System.out.printf("%d %d %d%n", c1, soma1, soma2);
			}

		sc.close();
	}

}
