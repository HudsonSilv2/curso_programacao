import java.util.Scanner;

public class Entrada_de_dados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String x;
		x = sc.nextLine();
		System.out.println("Você disse: " + x);

		sc.close();
	}

}
