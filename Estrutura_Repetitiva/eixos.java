//Programa que lê dois valores inteiros, e exibe a localização nas coordenadas (Q1, Q2, Q3, Q4), com o while

package reforco_logica;

import java.util.Scanner;

public class Eixos_while {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("Quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();

		}

		sc.close();

	}

}
