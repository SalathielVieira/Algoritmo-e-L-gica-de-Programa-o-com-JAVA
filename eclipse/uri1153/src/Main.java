import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int fat = N;
			
			for (int cont = 1; cont < N; cont++) {
				fat = fat * cont;
			}
			System.out.println(fat);
			
		sc.close();
	}

}
