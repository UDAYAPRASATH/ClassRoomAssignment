package week3.day1;

public class Chrome extends Browser {

	public void openIncognito() 
	{
		System.out.println("Incognito opened");
		
	}
	public void clearCache() 
	{
		System.out.println("Cache cleared");
	}
	public static void main(String[] args) {
		
		
		Chrome obj=new Chrome();
		obj.openURL();
		obj.openIncognito();
		obj.clearCache();
		obj.closeBrowser();
		obj.navigateBack();
		

	}

}
