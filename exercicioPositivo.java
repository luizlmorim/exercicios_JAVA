package fundamentos;

import java.util.Scanner;

public class exercicioPositivo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double resp = entrada.nextDouble();
		System.out.println(resp);
		
		if (resp > 0) {
			System.out.println("O numero inserido é positivo");
		} else {
			System.out.println("O numero inserido é negativo");
	}
	}
}
