import java.util.Scanner;

public class exer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int valor = sc.nextInt();
			
		if (valor == 1) {
			System.out.println("você entrou o valor " + valor);
		} else if (valor == 2) {
			System.out.println("você entrou o valor " + valor);
		} else if (valor < 1) {
			System.out.println("você entrou valor muito baixo");
		} else if (valor > 2) {
			System.out.println("você entrou valor muito alto");
		}
		
		sc.close();
	}

}
