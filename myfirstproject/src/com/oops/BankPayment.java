package com.oops;
abstract class PaymentsGateway{
	abstract void processpayment(double amount); 
		void showtransactions() {
			System.out.println("Transaction completed successfully");
		}
}

class creditcard extends PaymentsGateway{
	void processpayment(double amount) {
		System.out.println("Processing Credit card payment: "+amount);
	}
}

class upipayment extends PaymentsGateway{
	void processpayment(double amount) {
		System.out.println("Processing upi payments: "+amount);
	}
}
public class BankPayment {

	public static void main(String[] args) {
		PaymentsGateway p1=new creditcard();
		PaymentsGateway p2=new upipayment();
		p1.processpayment(1000);
		p2.processpayment(1500);

	}

}
