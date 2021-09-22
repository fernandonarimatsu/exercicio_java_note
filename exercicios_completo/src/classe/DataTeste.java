package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 12;
		d1.mes = 1;
		d1.ano = 1982;
	
		var d2 = new Data();
		d2.dia = 31;
		d2.mes = 12;
		d2.ano = 2020;
		
		String dataFormatada1 = d1.obterDataFormtada();		
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormtada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}

	
}
