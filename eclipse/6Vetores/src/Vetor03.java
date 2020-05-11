import java.util.Scanner;

public class Vetor03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("Digite a quantidade de elementos: ");
			int N = sc.nextInt();
			int A[] = new int[N];
			int B[] = new int[N];
			int C[] = new int[N];
			
			System.out.println("Digite o primeiro vetor:");
			for (int cont = 0; cont < N; cont++) {
				A[cont] = sc.nextInt();
			}
			System.out.println("Digite o segundo vetor:");
			for (int cont = 0; cont < N; cont++) {
				B[cont] = sc.nextInt();
			}
			for (int cont = 0; cont < N; cont++) {
				C[cont] = A[cont] + B[cont];
			}
			System.out.println("A soma entre os vetores:");
			for (int cont = 0; cont < N; cont++) {
				System.out.print(C[cont]+" ");
			}
			
		sc.close();
	}

}
