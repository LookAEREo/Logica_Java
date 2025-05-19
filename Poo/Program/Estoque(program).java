//Pequeno programa em java para controle de estoque com orientação à objetos

package entities;

import java.util.Locale;
import java.util.Scanner;

import program.Estq;

public class Produtos_estq {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Estq estq = new Estq();

		System.out.println("Enter product data");
		System.out.print("Name:");
		estq.name = sc.nextLine();
		System.out.print("Unit price:");
		estq.unitPrice = sc.nextDouble();
		System.out.print("Quantity:");
		estq.quantity = sc.nextInt();

		System.out.println();
		System.out.println("Info - " + estq);
		System.out.println("Do you want remove or increase stock? 1 for increase, 2 for remove");
		int increaseOrRemove = sc.nextInt();

		if (increaseOrRemove == 1) {
			System.out.println("Enter the quantity to add:");
			int qtyA = sc.nextInt();
			estq.addProducts(qtyA);
		} else if (increaseOrRemove == 2) {
			System.out.println("Enter the quantity to remove");
			int qtyR = sc.nextInt();
			estq.removeProucts(qtyR);
		}

		System.out.println("Updated info: " + estq);

		sc.close();

	}

}
