import java.util.Locale;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//entrada de dados		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();

//processamento de dados
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
//saída de dados
		System.out.printf("ÁREA = %.2f%n", area);
		System.out.printf("PREÇO = %.2f%n", preco);
		
		sc.close();
	}
}
