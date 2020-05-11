import java.util.Scanner;

public class ExercicioResolvido01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int[][] matriz = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					matriz[i][j] = sc.nextInt();
				}
			}
			System.out.println("DIAGONAL PRINCIPAL:");
			for(int i = 0; i < N; i++) {
				System.out.print(matriz[i][i] + " ");
			}
			System.out.println();
			int contNegativo = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (matriz[i][j] < 0) {
						contNegativo ++;
					}
				}
			}
			System.out.println("QUANTIDADE DE NEGATIVOS = " + contNegativo);
			
		sc.close();
	}

}
