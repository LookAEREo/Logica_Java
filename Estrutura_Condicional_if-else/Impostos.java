package bob_mimi;

import java.util.Locale;
import java.util.Scanner;

public class Impostos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double Renda = sc.nextDouble();
		double impostos;
		
		if (Renda <= 2000) {
			impostos = 0;
		} else if (Renda <= 3000.00) {
			impostos = (Renda - 2000.00) * 0.08; 
		} else if (Renda <= 4500) {
			impostos = 1000.00 * 0.08 + (Renda - 3000) * 0.18; 
		} else {
			impostos = 1000.00 * 0.08 + 1500.00 * 0.18 + (Renda - 4500) * 0.28;
		}
		
		if (impostos == 0) {
			System.out.println("insento");
		} else {
			System.out.printf("R$ %.2f%n", impostos);
		}
		
		sc.close();
	}

}
