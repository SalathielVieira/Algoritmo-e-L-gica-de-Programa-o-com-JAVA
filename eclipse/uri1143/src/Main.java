import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			
			for (int cont = 1; cont <= N; cont++) {
				int seg = cont * cont;
				int ter = cont * cont * cont;
				System.out.printf("%d %d %d%n", cont, seg, ter);
			}

		sc.close();
	}

}
/* Minha solução, não passou
for (int cont1 = 1; cont1 <= N; cont1++) {
 
for (int cont2 = 0; cont2 < 3; cont2++) {
	res = res * cont1;
	System.out.print(res+" ");
}

System.out.println();
res = 1;
}*/