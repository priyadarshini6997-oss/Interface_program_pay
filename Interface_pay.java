package com.index;

interface payment{
	void pay();
}

class CreditCardPayment implements payment
{
	public void pay() {
	System.out.println("Payment made by credit card.");
	}
}

class UPIPayment implements payment
{
	public void pay() {
	System.out.println("Payment made by UPI.");
	}
}
public class Interface_pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCardPayment cc = new CreditCardPayment();
		UPIPayment ui = new UPIPayment();
		cc.pay();
		ui.pay();

	}

}
