package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 9;
		d1.mes = 11;
		d1.ano = 2020;
		
		var d2 = new Data();
		d2.dia = 10;
		d2.mes = 12;
		d2.ano = 2021;
		
		System.out.println(d1.obeterDataFormatada());
		System.out.println(d2.obeterDataFormatada());
	}
}
