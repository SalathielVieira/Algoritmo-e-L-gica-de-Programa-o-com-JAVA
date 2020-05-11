import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int pos = 0;
			int mai = 0;
			
			for (int cont = 1; cont <= 100; cont++) {
				int val = sc.nextInt();
				
				if (val > mai) {
					mai = val;
					pos = cont;
				}
			}
			System.out.println(mai);
			System.out.println(pos);
		sc.close();
	}

}
