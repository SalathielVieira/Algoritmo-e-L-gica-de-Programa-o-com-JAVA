import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x < y) {
			int soma = 0;
			for (int cont = x + 1; cont < y; cont++) {
				if (cont % 2 != 0) {
					soma = soma + cont;
				}
			}
			System.out.println(soma);
		} else {
			int soma = 0;
			for (int cont = y + 1; cont < x; cont++) {
				if (cont % 2 != 0) {
					soma = soma + cont;
				}
			}
			System.out.println(soma);
		}
		
		sc.close();
	}

}
