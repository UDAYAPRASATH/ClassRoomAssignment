package week3.day2;

public abstract class CanaraBank implements Payments {
	


@Override
public void cashOnDelivery() {
	System.out.println("Cash On Deliver..");
	
}

@Override
public void upiPayments() {
	System.out.println("UPI ID...");
	
}

@Override
public void cardPayments() {

	System.out.println("Credit Card...");
}

@Override
public void internetBanking() {

	System.out.println("Internet Banking available..");
}

abstract void recordPaymentDetails();

}
