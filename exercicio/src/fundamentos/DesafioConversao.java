package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Primeiro salario: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Segundo salario: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Terceiro salario: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		double numero1 = Double.parseDouble(salario1); 
		double numero2 = Double.parseDouble(salario2); 
		double numero3 = Double.parseDouble(salario3); 
		
		double media = (numero1 + numero2 + numero3) / 3;
		
		System.out.println("A m�dia dos s�lario �: " + media);
		
		entrada.close();
	}
}
