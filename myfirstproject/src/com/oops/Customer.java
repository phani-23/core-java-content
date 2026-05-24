package com.oops;

interface PaymentGateway {
	void processPayment(double amount);
}

class PayPalGateway implements PaymentGateway {
	public void processPayment(double amount) {
		System.out.println("Processing PayPal payment of ₹" + amount);
	}
}

class UPIGateway implements PaymentGateway {
	public void processPayment(double amount) {
		System.out.println("Processing UPI payment of ₹" + amount);
	}
}

public class Customer {
	private PayPalGateway paypal = new PayPalGateway();
	private UPIGateway upi = new UPIGateway();

	public void payWithPayPal(double amount) {
		paypal.processPayment(amount);
	}

	public void payWithUPI(double amount) {
		upi.processPayment(amount);
	}

}
