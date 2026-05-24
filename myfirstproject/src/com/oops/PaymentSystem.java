package com.oops;

public class PaymentSystem {

	public static void main(String[] args) {
		Customer customer = new Customer();

        customer.payWithPayPal(1500.00); // Calls PayPalGateway
        customer.payWithUPI(750.00);     // Calls UPIGateway
        customer.payWithUPI(200);
        customer.payWithPayPal(1000);
	}

}
