/* Fa�a um programa para ler um n�mero indeterminado de dados, contendo cada um, a idade de um
 * indiv�duo. O �ltimo dado, que n�o entrar� nos c�lculos, cont�m um valor de idade negativa.
 * Calcular e imprimir a idade m�dia deste grupo de indiv�duos. Se for entrado um valor negativo
 * na primeira vez, mostrar a mensagem "impossivel calcular". */
/* Exemplos:
 * Entrada: 31 27 46 -5 -----> Sa�da: 34.67
 * Entrada: -10 -------------> Sa�da: impossivel calcular */

import java.util.Scanner;
import java.util.Locale;

public class ExResolvido01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Para trabalhar com n�meros com ponto flutuante
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt(); // Criar a vari�vel idade para a entrada de dados.
		int soma = 0; // Criar a vari�vel soma para somar as idade, para o c�lculo da m�dia.
		int cont = 0; // Criar a vari�vel cont para calcular a quantidade de idade.
		
		while (idade >= 0) { // Enquanto idade for maior ou igual a 0, execute:
			soma += idade; // Efetuar a soma das idades v�lidas.
			cont ++; // Incrementar o contador a cada idade v�lida entrada.
			idade = sc.nextInt(); // Solicitar a entrada de uma nova idade.
		}
		if (cont > 0) { // Ao finalizar o while, qdo se digita uma idade negativa.
						// Se o contador for maior que 0 significa que existiram idades v�lidas.
			double media = (double)soma / cont; // Criar a vari�vel media
												// Converter para ponto flutuante, validando valores decimais.
												// Calcular a m�dia
			System.out.printf("%.2f%n", media); // Exibir o resultado na tela com duas casas decimais.
		}
		else { /* Caso o contador permanecer em 0, n�o entraram idades v�lidas, isto �, a idade
				inicial foi um valor negativo*/
			System.out.println("impossivel calcular"); // Sendo assim, exibir "impossivel calcular"
		}
		sc.close();
	}

}
