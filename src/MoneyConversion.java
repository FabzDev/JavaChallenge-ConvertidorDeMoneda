
public class MoneyConversion {
	double COP_USD = 0.00021;
	double COP_EUR = 0.00020;
	double COP_GBP = 0.00017;
	double COP_JPY = 0.028;
	double COP_KRW = 0.27;
	double USD_COP = 4850.50;
	double EUR_COP = 5229.08;
	double GBP_COP = 5908.87;
	double JPY_COP = 36.79;
	double KRW_COP = 3.71;
	double amount;
	
	
	public MoneyConversion(double amount) {
	this.amount = amount;
	}
	
	public double COP_USD() {
		double resultado;
		resultado = this.COP_USD * this.amount;
		return resultado;
	}
	
	public double COP_EUR() {
		double resultado;
		resultado = this.COP_EUR * this.amount;
		return resultado;
	}
	
	public double COP_GBP() {
		double resultado;
		resultado = this.COP_GBP * this.amount;
		return resultado;
	}
	
	public double COP_JPY() {
		double resultado;
		resultado = this.COP_JPY * this.amount;
		return resultado;
	}
	
	public double COP_KRW() {
		double resultado;
		resultado = this.COP_KRW * this.amount;
		return resultado;
	}
	
	public double USD_COP() {
		double resultado;
		resultado = this.USD_COP * this.amount;
		return resultado;
	}
	
	public double EUR_COP() {
		double resultado;
		resultado = this.EUR_COP * this.amount;
		return resultado;
	}
	
	public double GBP_COP() {
		double resultado;
		resultado = this.GBP_COP * this.amount;
		return resultado;
	}
	
	public double JPY_COP() {
		double resultado;
		resultado = this.JPY_COP * this.amount;
		return resultado;
	}
	
	public double KRW_COP() {
		double resultado;
		resultado = this.KRW_COP * this.amount;
		return resultado;
	}
	
}
