package week3.day1;

public class Edge extends Browser{
	
	public void takeSnap()
	{
	System.out.println("Snap taken...");	
	}
	
	public void clearCookies(){
		System.out.println("Cookies Cleared...");
	}

	public static void main(String[] args) {
	      
		Edge obj=new Edge();
		obj.openURL();
		obj.takeSnap();
		obj.clearCookies();
		obj.closeBrowser();
		obj.navigateBack();

	}

}
