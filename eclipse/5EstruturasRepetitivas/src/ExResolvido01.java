/* Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um
 * indivíduo. O último dado, que não entrará nos cálculos, contém um valor de idade negativa.
 * Calcular e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo
 * na primeira vez, mostrar a mensagem "impossivel calcular". */
/* Exemplos:
 * Entrada: 31 27 46 -5 -----> Saída: 34.67
 * Entrada: -10 -------------> Saída: impossivel calcular */

import java.util.Scanner;
import java.util.Locale;

public class ExResolvido01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Para trabalhar com números com ponto flutuante
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt(); // Criar a variável idade para a entrada de dados.
		int soma = 0; // Criar a variável soma para somar as idade, para o cálculo da média.
		int cont = 0; // Criar a variável cont para calcular a quantidade de idade.
		
		while (idade >= 0) { // Enquanto idade for maior ou igual a 0, execute:
			soma += idade; // Efetuar a soma das idades válidas.
			cont ++; // Incrementar o contador a cada idade válida entrada.
			idade = sc.nextInt(); // Solicitar a entrada de uma nova idade.
		}
		if (cont > 0) { // Ao finalizar o while, qdo se digita uma idade negativa.
						// Se o contador for maior que 0 significa que existiram idades válidas.
			double media = (double)soma / cont; // Criar a variável media
												// Converter para ponto flutuante, validando valores decimais.
												// Calcular a média
			System.out.printf("%.2f%n", media); // Exibir o resultado na tela com duas casas decimais.
		}
		else { /* Caso o contador permanecer em 0, não entraram idades válidas, isto é, a idade
				inicial foi um valor negativo*/
			System.out.println("impossivel calcular"); // Sendo assim, exibir "impossivel calcular"
		}
		sc.close();
	}

}
