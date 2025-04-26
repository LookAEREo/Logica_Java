// Programa de adivinhação:
// O usuário deve digitar um número entre 1 e 10.
// O número correto é 7.

package reforco_logica;

import java.util.Scanner;

public class Numero_Secreto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Desafio acerte e ganhe!");
		System.out.println("Digite um numero de 1 a 10:");

		int x = sc.nextInt();

		while (x != 7) {
			if (x > 10 || x < 1) {
			System.out.println("Numero invalido");
			} else 
				System.out.println("errado, tente novamente");
				x = sc.nextInt();
			}
		
		System.out.println("Acertou!");
		
		sc.close();

	}

}
