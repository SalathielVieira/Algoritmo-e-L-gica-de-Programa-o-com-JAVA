import java.util.Scanner;

public class pratica_01 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		// Estrutura de controle, porque controla o fluxo do algoritmo
		// Encadeamento de Estruturas Condicionais
		if (hora < 12) { 
			System.out.println("Bom dia");
		}
		else if (hora < 18) { 
			System.out.println("Boa tarde");
		}
		else { 
				System.out.println("Boa noite");
		}
		sc.close();		
	}
}