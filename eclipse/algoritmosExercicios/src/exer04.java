import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = 0;
			int X = sc.nextInt();
			
			if (!(X > 5)) {
				C = A + B;
			}
			else {
				C = A - B;
			}
			System.out.println(C);
		
		sc.close();
	}

}
