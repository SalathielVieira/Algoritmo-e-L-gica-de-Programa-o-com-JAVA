import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int M = sc.nextInt();
			int N = sc.nextInt();
			
			while (M > 0 && N > 0) {
				int Menor = M;
				int Maior = N;
				
				if (N < M) {
					Menor = N;
					Maior = M;
				}
				
				int soma = 0;
				
				for (int cont = Menor; cont <= Maior; cont++) {
					soma = soma + cont;
					System.out.print(cont + " ");
				}
				
				System.out.println("Sum=" + soma);
				
				M = sc.nextInt();
				N = sc.nextInt();
			}
			
		sc.close();
	}

}
