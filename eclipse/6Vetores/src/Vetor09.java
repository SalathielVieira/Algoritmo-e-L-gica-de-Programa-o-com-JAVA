import java.util.Locale;
import java.util.Scanner;

public class Vetor09 {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
		//Declaração de variáveis	
			int N = sc.nextInt();
			String[] mercadoria = new String[N];
			double[] pCompra = new double[N];
			double[] pVenda = new double[N];
			int lAbaixo10 = 0;
			int lEntre10E20 = 0;
			int lAcima20 = 0;
			double vTotCompra = 0.0;
			double vTotVenda = 0.0;
			double lucroTotal = 0.0;
		//Entrada de dados	
			for (int cont = 0; cont < N; cont++) {
				mercadoria[cont] = sc.next();
				pCompra[cont] = sc.nextDouble();
				pVenda[cont] = sc.nextDouble();
			}
		//Cálculos e demonstração
			System.out.println("========== Lucro das mercadorias ==========");
			for (int cont = 0; cont < N; cont++) {
				if(pVenda[cont] / pCompra[cont] < 1.1) {
					lAbaixo10++;
					double lucro10 = (pVenda[cont] / pCompra[cont] - 1) * 100;
					System.out.printf("Mercadoria: %s com lucro de %.2f%%.%n", mercadoria[cont], lucro10);
				} else if (pVenda[cont] / pCompra[cont] <= 1.2) {
					lEntre10E20++;
					double lucro20 = (pVenda[cont] / pCompra[cont] - 1) * 100;
					System.out.printf("Mercadoria: %s com lucro de %.2f%%.%n", mercadoria[cont], lucro20);
				} else if (pVenda[cont] / pCompra[cont] > 1.2) {
					lAcima20++;
					double lucroAcima20 = (pVenda[cont] / pCompra[cont] - 1) * 100;
					System.out.printf("Mercadoria: %s com lucro de %.2f%%.%n", mercadoria[cont], lucroAcima20);
				}
				vTotCompra += pCompra[cont];
				vTotVenda += pVenda[cont];
			}
			System.out.println("=========================================");
			lucroTotal = vTotVenda - vTotCompra;
		//Saída de dados
			System.out.println("================= RESUMO ================");
			System.out.println("Lucro abaixo de 10%: " + lAbaixo10);
			System.out.println("Lucro entre 10% e 20%: " + lEntre10E20);
			System.out.println("Lucro acima de 20%: " + lAcima20);
			System.out.printf("Valor total de compra: %.2f%n", vTotCompra);
			System.out.printf("Valor total de venda: %.2f%n", vTotVenda);
			System.out.printf("Lucro total: %.2f%n", lucroTotal);
			System.out.println("=========================================");
		sc.close();
	}

}
