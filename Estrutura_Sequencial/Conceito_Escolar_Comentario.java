//Programa que lê a nota de um aluno e exibe um conceito + comentário (dessa vez com ajuda do switch) 

package reforco_logica;

import java.util.Scanner;

public class Conceito_Escolar_Comentario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua nota:");
		int x = sc.nextInt();

		if (x > 10 || x < 0) {
			System.out.println("NOTA INVALIDA");
		} else {
			switch (x) {
			case 10:
			case 9:
				System.out.println("Conceito A");
				System.out.println("Excelente desempenho");
				break;
			case 8:
			case 7:
				System.out.println("Conceito B");
				System.out.println("Bom, continue assim");
				break;
			case 6:
			case 5:
				System.out.println("Conceito C");
				System.out.println("Regular, estude mais");
				break;
			case 4:
			case 3:
				System.out.println("Conceito D");
				System.out.println("Ruim, atenção redobrada");
				break;
			case 2:
			case 1:
			case 0:
				System.out.println("Conceito E");
				System.out.println("Reprovado");

			}
		}

		sc.close();

	}

}
