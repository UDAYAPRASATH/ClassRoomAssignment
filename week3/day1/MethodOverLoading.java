package week3.day1;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading obj=new MethodOverLoading();
		obj.reportStep("Hello","Accepted");
		obj.reportStep("Take Screenshot","Accepted",true);

	}
	
	public void reportStep(String msg,String status )
	{
		System.out.print(msg+"-->");
		System.out.println(status);
	}
	public void reportStep(String msg,String status,boolean snap)
	{
		System.out.print(msg+"-->");
		System.out.println(status);
		System.out.println(snap);
	}

}
