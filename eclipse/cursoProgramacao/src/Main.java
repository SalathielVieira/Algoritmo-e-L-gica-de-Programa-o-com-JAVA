import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println(x);
		
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);

//		printf: a letra "f" é abreviação da expressão "formatado";
//		para especificar duas casas decimais "%.2f" + 
//		"%n" ou "/n" que indica a quebra de linha +
//		"," + a variável;
//		Locale é uma classe que serve para configura localização no aplicativo;
//		Para utilizar essa classe é necessário importar essa classe:
//      "import java.util.Locale;"

//		Para concatenar vários elementos se utiliza o operador "+"
		
		System.out.println("RESULTADO = " + x +" METROS");
		
//		Para concatenar vários elementos em um mesmo comando de escrita "printf"
//    	"TEXTO1 %f TEXTO2 %f TEXTO3", variavel, variavel2
//		'%f' = ponto flutuante; '%d' = inteiro; '%s' = texto; '%n' = quebra de linha
		
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		System.out.println(y);
		System.out.println("Bom dia!");

	}
}
