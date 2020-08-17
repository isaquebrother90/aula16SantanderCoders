package Moedas;

public class Dolar {
	
	public static final double IOF = 0.06;
	
	public static double convert(double stock, double dolar) {
		return (stock*dolar) + (stock*dolar*IOF);
	}
	
	
	
	
	/*
	public double cotacaoDolar;
	public double valorCompraDeDolares;
	public double calculo;
	public double taxa;
	public double valorFinal;
	
	public double conversorDeMoeda() {
		calculo =  (valorCompraDeDolares * cotacaoDolar);
		//taxa = calculo / 100 * 6;
		//valorFinal = calculo + taxa;
		return calculo;
	}
	
	public double taxa() {
		return conversorDeMoeda() / 100 * 6;
	}
	
	public double valorFinal() {
		return conversorDeMoeda() + taxa();
	}
	*/

}
