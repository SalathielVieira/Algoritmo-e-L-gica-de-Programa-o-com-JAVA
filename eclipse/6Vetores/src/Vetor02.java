import java.util.Scanner;

public class Vetor02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int[] inteiros = new int[N];
			int qPares = 0;
			
			for (int cont = 0; cont < N; cont++) {
				inteiros[cont] = sc.nextInt();
			}
			for (int cont = 0; cont < N; cont++) {
				if (inteiros[cont] % 2 == 0) {
					System.out.print(inteiros[cont]+" ");
					qPares++;
				}
			}
			System.out.println();
			System.out.println(qPares);
			
		sc.close();
	}

}
