import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int pri = 0;
		int seg = 0;
		int ter = 0;
		
		if (x < y && x < z) {
			pri = x;
			if (y < z) {
				seg = y;
				ter = z;
			} else {
				seg = z;
				ter = y;
			}
		}
		if (y < x && y < z) {
			pri = y;
			if (x < z) {
				seg = x;
				ter = z;
			} else {
				seg = z;
				ter = x;
			}
		}
		if (z < x && z < y) {
			pri = z;
			if (x < y) {
				seg = x;
				ter = y;
			} else {
				seg = y;
				ter = x;
			}
		}
		
		System.out.println(pri);
		System.out.println(seg);
		System.out.println(ter);
		System.out.println();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		sc.close();
	}

}
