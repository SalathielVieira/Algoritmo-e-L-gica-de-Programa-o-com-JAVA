import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inter, gremio;
        int nGrenal = 1;
        int vInter = 0;
        int vGremio = 0;
        int empate = 0;
        int grenais = 0;
        
        while (nGrenal == 1) {
            inter = sc.nextInt();
            gremio = sc.nextInt();
            grenais++;
            if (inter > gremio) {
                vInter++;
            } else if (gremio > inter){
                vGremio++;
            } else {
                empate++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            nGrenal = sc.nextInt();
        }
        
        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + vInter);
        System.out.println("Gremio:" + vGremio);
        System.out.println("Empates:" + empate);
        
        if (vInter > vGremio) {
            System.out.println("Inter venceu mais");
        } else if (vGremio > vInter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Não houve vencedor");
        }
        
        sc.close();
	}
}
