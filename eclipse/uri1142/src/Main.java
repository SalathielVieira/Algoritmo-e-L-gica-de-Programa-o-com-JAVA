import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int cont2 = 1;
			int aux = 4;
			
			for (int cont1 = 1; cont1 <= N; cont1++) {
				
				while (cont2 < aux) {
					System.out.print(cont2+" ");
					cont2++;
				}

				System.out.println("PUM");
				aux += 4;
				cont2++;
			}
		sc.close();
	}
}
