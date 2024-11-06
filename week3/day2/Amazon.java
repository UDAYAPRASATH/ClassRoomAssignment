package week3.day2;

public class Amazon extends CanaraBank {

	public static void main(String[] args) {
		Amazon obj=new Amazon();
		obj.cardPayments();
		obj.upiPayments();
		obj.cashOnDelivery();
		obj.internetBanking();

	
	}

	@Override
	void recordPaymentDetails() {

		System.out.println("1000 ruppees withdrawn...");
		
	}

}
