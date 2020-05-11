import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hI = sc.nextInt();
		int mI = sc.nextInt();
		int hF = sc.nextInt();
		int mF = sc.nextInt();
		int inicio, fim, hDuracao, mDuracao;
		
		int duracao;
		
		inicio = hI * 60 + mI;
		fim = hF * 60 + mF;
		
		if (inicio < fim) {
			duracao = fim - inicio;
		}
		else {
			duracao = (24 * 60 - inicio) + fim;
		}
		
		hDuracao = duracao / 60;
		mDuracao = duracao % 60;
		
		System.out.println("O JOGO DUROU " + hDuracao + " HORA(S) E " + mDuracao + " MINUTO(S)");
		
		sc.close();
	}

}
