import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			
			for (int cont = 1; cont <= N; cont++) {
				if (N % cont == 0) {
					System.out.println(cont);
				}
			}
		sc.close();
	}

}
