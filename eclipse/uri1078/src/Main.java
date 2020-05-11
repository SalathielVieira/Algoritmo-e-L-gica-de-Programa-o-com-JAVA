import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			for (int cont = 1; cont <= 10; cont++) {
				int tab = cont * n;
				System.out.println(cont + " x " + n + " = " + tab);
			}
			
		sc.close();
	}

}
