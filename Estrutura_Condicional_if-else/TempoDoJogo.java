//Programa capaz de calcular a duração de um evento com base em seu horario de inicio e termino 

package bob_mimi;

import java.util.Scanner;

public class TempoDoJogo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int IN, FIM;
		int HORARIO;
		
		System.out.println("Digite o horario de inicio do jogo:");
		IN = sc.nextInt();
		
		System.out.println("Digite o horario de termino do jogo");
		FIM = sc.nextInt();
		
		if (IN < FIM) {
			HORARIO  = FIM - IN; 
		} else {
			HORARIO = 24 - IN + FIM;
		}
		
	    System.out.println("O JOGO DUROU " + HORARIO + " HORA(S)");
		
		sc.close();
	}

}
