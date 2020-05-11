import java.util.Locale;
import java.util.Scanner;

public class Vetor07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			String[] alunos = new String[N];
			double[] priSemestre = new double[N];
			double[] segSemestre = new double[N];
			double[] mediaAluno = new double[N];
		//Entrada dos dados
			for(int cont = 0; cont < N; cont++) {
				alunos[cont] = sc.next();
				priSemestre[cont] = sc.nextDouble();
				segSemestre[cont] = sc.nextDouble();
				mediaAluno[cont] = (priSemestre[cont] + segSemestre[cont]) / 2;
			}
		//Apresentação dos alunos aprovados
			System.out.println("Alunos aprovados:");
			for(int cont = 0; cont < N; cont++) {
				if (mediaAluno[cont] >= 6.0) {
					System.out.printf("%s com média %.1f%n", alunos[cont], mediaAluno[cont]);
				}
			}
			
			
		sc.close();
	}

}
