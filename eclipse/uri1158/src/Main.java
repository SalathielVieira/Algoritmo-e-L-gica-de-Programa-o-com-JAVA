import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
						
			for (int cont = 1; cont <= N; cont++) {
				int soma = 0;
				int X = sc.nextInt();
				int Y = sc.nextInt() * 2;
				
				for (int cont1 = 1; cont1 <= Y; cont1++) {
				
					if (X % 2 != 0) {
						soma = soma + X;
					}
					
					X++;
				}
				System.out.println(soma);
			}
			
		sc.close();
	}

}
