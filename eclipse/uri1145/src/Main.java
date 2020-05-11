import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();

		for (int cont = 1; cont <= Y; cont++) {
			
			System.out.print(cont);
			
			if (cont % X == 0) {
				System.out.println();
			}
			else {
				System.out.print(" ");
			}
		}
			
		sc.close();
	}

}


/*int X = sc.nextInt();
int Y = sc.nextInt();

for (int i = 1; i < Y; i+= X) {
	System.out.printf("%d", i);
	
	for (int ii = i; ii < i + X - 1; ii++) {
		System.out.printf(" %d", ii + 1);
	}
	
	System.out.println();
}*/