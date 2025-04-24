//A diferença do produto "a" e "b" pelo produto de "c" e "d"

package bob_mimi;

import java.util.Scanner;

public class DiferençaDoProduto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c, d;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		int DIFERENCA = (a * b - c * d);

		System.out.println("O resultado e: " + DIFERENCA);

		sc.close();

	}

}
