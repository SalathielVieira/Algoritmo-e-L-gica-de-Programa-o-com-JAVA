import java.util.*;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double A, B, C, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		TRIANGULO = (A*C)/2;
		CIRCULO = 3.14159*Math.pow(C,2);
		TRAPEZIO = ((A+B)*C)/2;
		QUADRADO = Math.pow(B,2);
		RETANGULO = A*B;
		
		System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO);
		
		sc.close();
	}
}
