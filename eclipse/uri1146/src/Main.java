import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
			int X = sc.nextInt();
			
			while (X != 0) {
				
				for (int cont = 1; cont <= X; cont++) {
					System.out.print(cont);
					if (cont != X) {
						System.out.print(" ");
					} else {
						System.out.println();
					}
				}
				X = sc.nextInt();
			}
					
		sc.close();
	}

}
