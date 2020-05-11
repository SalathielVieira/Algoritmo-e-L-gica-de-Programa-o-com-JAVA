import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int combustivel = sc.nextInt();
			int alcool = 0;
			int gasolina = 0;
			int diesel = 0;
			
			while (combustivel != 4) {
				if (combustivel < 1 && combustivel > 4) {
					combustivel = sc.nextInt();
				} else {
					switch (combustivel) {
					case 1:
						alcool++;
						break;
					case 2:
						gasolina++;
						break;
					case 3:
						diesel++;
						break;
					}
					combustivel = sc.nextInt();
				}
			}
			
			System.out.println("MUITO OBRIGADO");
			System.out.println("Alcool: " + alcool);
			System.out.println("Gasolina: " + gasolina);
			System.out.println("Diesel: " + diesel);

		sc.close();
	}
}
