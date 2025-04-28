import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		double x = 10.039238657;
		String nome = "Hudson";
		int idade = 18;
		double renda = 1500.0;
		
		
		System.out.println(x);
		
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		System.out.println("RESULTADO = " + x + "metros\n");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		//PrintF
		
		System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, renda);
	}

}
