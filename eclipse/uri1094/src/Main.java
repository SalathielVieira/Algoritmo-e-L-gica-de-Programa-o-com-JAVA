import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			
			int tCobaias = 0;
			int tCoelhos = 0;
			int tRatos = 0;
			int tSapos = 0;
			
			double pCoelhos = 0.0;
			double pRatos = 0.0;
			double pSapos = 0.0;
			
			for (int cont = 0; cont < N; cont++) {
				int quantia = sc.nextInt();
				String tipo = sc.next();
				
				tCobaias += quantia;
				
				if (tipo.equals("C")) {
					tCoelhos += quantia; 
				} else if (tipo.equals("R")) {
					tRatos += quantia;
				} else if (tipo.equals("S")) {
					tSapos += quantia;
				}
			}
			
			pCoelhos = (double) tCoelhos * 100 / tCobaias;
			pRatos = (double) tRatos * 100 / tCobaias;
			pSapos = (double) tSapos * 100 / tCobaias;
			
			System.out.println("Total: "+ tCobaias +" cobaias");
			System.out.println("Total de coelhos: "+ tCoelhos);
			System.out.println("Total de ratos: "+ tRatos);
			System.out.println("Total de sapos: "+ tSapos);
			
			System.out.printf("Percentual de coelhos: %.2f %%%n", pCoelhos);
			System.out.printf("Percentual de ratos: %.2f %%%n", pRatos);
			System.out.printf("Percentual de sapos: %.2f %%%n", pSapos);

		sc.close();
	}

}
