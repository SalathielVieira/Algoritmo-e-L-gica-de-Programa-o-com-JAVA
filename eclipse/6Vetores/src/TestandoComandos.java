import java.util.Random;
import java.util.Scanner;

public class TestandoComandos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random rr = new Random();
        int rounds = sc.nextInt();
        int results[] = new int[rounds];
        String l1 = "Pretty Boy";
        String l2 = "Putscript";
        int v1 = 0;
        int v2 = 0;
        for (int cont = 0; cont < rounds; cont++){
            results[cont] = rr.nextInt(2);
        }
        System.out.println("------------ RESULTADO DOS ROUNDS ------------");
        for (int cont = 0; cont < rounds; cont++){
            int r = results[cont];
        	switch(r){
                case 0:
                    System.out.println("Round " + cont + ": " + l1);
                    v1 += 1;
                    break;
                case 1:
                    System.out.println("Round " + cont + ": " + l2);
                    v2 += 1;
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("-------------- RESULTADO FINAL ---------------");
        if (v1 > v2){
            System.out.println(l1 + " venceu " + v1 + " rounds.");
            System.out.println(l2 + " venceu " + v2 + " rounds.");
        } else if (v2 > v1){
            System.out.println(l2 + " venceu " + v2 + " rounds.");
            System.out.println(l1 + " venceu " + v1 + " rounds.");
        } else {
            System.out.println(l1 + " venceu " + v1 + " rounds.");
            System.out.println(l2 + " venceu " + v2 + " rounds.");
            System.out.println("Luta empatada");
        }
        System.out.println("----------------------------------------------");
    sc.close();

	}

}
