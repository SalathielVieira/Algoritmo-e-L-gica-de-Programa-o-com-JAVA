import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			
			for (int cont = 0; cont < N; cont++) {
				int X = sc.nextInt();
				if (X > 0) {
					if (X % 2 == 0) {
					System.out.println("EVEN POSITIVE");
					} else {
					System.out.println("ODD POSITIVE");
					}
				} else if (X < 0) {
					if (X % 2 == 0) {
						System.out.println("EVEN NEGATIVE");
					} else {
						System.out.println("ODD NEGATIVE");
					}
				} else {
					System.out.println("NULL");
				}
			}
		sc.close();
	}
}
