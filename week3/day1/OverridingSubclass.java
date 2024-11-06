package week3.day1;

public class OverridingSubclass extends OverriddingSuperclass {

	public static void main(String[] args) {

		OverridingSubclass obj=new OverridingSubclass();
		obj.takeSnap();
	}
	
	public void takeSnap()
	{
		System.out.println("Snap Taken...");
	}

}
