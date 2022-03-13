package model.services;

public class BrazilTaxService implements TaxService { //Trecho ligado a TaxService(Interface)
	
	public double tax(double amount) {
		if (amount <= 100.0) {
			return amount * 0.2;
		}
		else {
			return amount * 0.15;
		}
	}
}
