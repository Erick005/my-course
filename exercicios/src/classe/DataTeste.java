package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 9;
		d1.mes = "Novembro";
		d1.ano = 2020;
		
		var d2 = new Data();
		d2.dia = 10;
		d2.mes = "Dezembro";
		d2.ano = 2021;
		
		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);
	}
}