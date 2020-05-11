import java.util.*;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
            int ncalc = 1;
            double soma = 0.0;
            int cont = 1;
            
            
            while (ncalc == 1) {
                while (cont <= 2){
                    double nota = sc.nextDouble();
                    if (nota >= 0.0 && nota <= 10.0) {
                        soma += nota;
                        cont ++;
                    } else {
                        System.out.println("nota invalida");
                    }
                }
            double media = soma / 2.0;
            System.out.printf("media = %.2f%n", media);

            System.out.println("novo calculo (1-sim 2-nao)");
            ncalc = sc.nextInt();
            
                while (ncalc < 1 || ncalc > 2){
                    System.out.println("novo calculo (1-sim 2-nao)");
                    ncalc = sc.nextInt();
                }
                cont = 1;
                soma = 0.0;
            }
        sc.close();
	}
}
