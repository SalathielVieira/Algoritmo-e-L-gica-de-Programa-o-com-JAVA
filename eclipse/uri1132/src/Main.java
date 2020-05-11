import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int ini, fim;
			int soma = 0;
			
			if (X < Y) {
				ini = X;
				fim = Y;
			} else {
				ini = Y;
				fim = X;
			}
			
			for (int cont = ini; cont <= fim; cont++) {
				if (cont % 13 != 0) {
					soma = soma + cont;
				}
			}
			
			System.out.println(soma);
			
		sc.close();
	}
}
