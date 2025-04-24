//Programa que calcula a área de um circulo, triângulo, quadrado, trapézio e retângulo com base em 3 valores com ponto flutuante 

package bob_mimi;

import java.util.Locale;
import java.util.Scanner;

public class Triangulos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 
		double A, B, C, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO , RETANGULO;
		double PI = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		TRIANGULO = A*C/2; 
		CIRCULO = PI * Math.pow(C, 2);
		TRAPEZIO = (A+B)*C/2;
		QUADRADO = B*4;
		RETANGULO = A*B; 
		
		System.out.printf("TRIANGULO:%.3f%n", TRIANGULO);
		System.out.printf("CIRCULO:%.3f%n", CIRCULO);
		System.out.printf("TRAPEZIO:%.3f%n", TRAPEZIO);
		System.out.printf("QUADRADO:%.3f%n", QUADRADO);
		System.out.printf("RETANGULO:%.3f%n", RETANGULO);
		
		sc.close();
		
		



	}

}
