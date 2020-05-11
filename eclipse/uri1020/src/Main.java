import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N, ano, mes, dia, resto;
		
		N = sc.nextInt();
		
		ano = N / 365;
		resto = N % 365;
		
		mes = resto / 30;
		resto = resto % 30;
		
		dia = resto / 1;
	
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
		
		sc.close();

	}

}
