import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int soma = 0;
						
			while (x != 0) {
				if (x % 2 == 0) {
					for (int cont = 0; cont <= 8; cont += 2) {
						soma = soma + x + cont;
					}
					System.out.println(soma);
				} else {
					x = x + 1;
					for (int cont = 0; cont <= 8; cont += 2) {
						soma = soma + x + cont;
					}
					System.out.println(soma);
				}
				soma = 0;
				x = sc.nextInt();
			}
			
		sc.close();
	}

}
