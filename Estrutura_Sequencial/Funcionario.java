package bob_mimi;

import java.util.Scanner;
import java.util.Locale;

public class Funcionario {

	public static void main(String[] args) {
		
		  Locale.setDefault(Locale.US);
		  Scanner sc = new Scanner (System.in);
		 
		  int NF, HT;
		  double VHT, SALARY;
		
		NF = sc.nextInt();
		HT = sc.nextInt();
		VHT = sc.nextDouble();
		
		SALARY = VHT*HT;
		
		System.out.println("NUMBER = " + NF);
		System.out.printf("SALARY = U$%.2f%n ", SALARY);
	    
		sc.close();

	}
}
