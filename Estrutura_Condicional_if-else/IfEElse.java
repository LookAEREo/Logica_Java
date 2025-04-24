//Programa que exibe: "Bom dia", "Boa tarde" ou "Boa noite", com base no horário informado pelo usuário

package bob_mimi;

import java.util.Scanner;

public class IfEElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hora;

		System.out.println("Que horas sao?:");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia!");
		} 
		else if (hora < 18) { 
			System.out.println("Boa tarde");
		}	
		else {
			System.out.println("Boa noite!");
		}

		sc.close();

	}

}
