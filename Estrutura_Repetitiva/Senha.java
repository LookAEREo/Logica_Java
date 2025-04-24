package reforco_logica;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int SENHA = sc.nextInt();
		
		while (SENHA != 2002) {
			System.out.println("Senha invalida");
			SENHA = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();

	}

}
