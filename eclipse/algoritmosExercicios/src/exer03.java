import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String SEXO = sc.nextLine();
		
		if (SEXO == "M" || SEXO == "F") {
			System.out.println("Sexo válido!");
		}
		else {
			System.out.println("Sexo inválido!");
		}
		
		sc.close();
	}

}
