package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		final double fator = 5/9.0;
		final int ajuste = 32;
		int f = 86;
	
		double c = (f - ajuste) * fator;
		
		System.out.println("O resultado é " + c + "C.");
	}
}
