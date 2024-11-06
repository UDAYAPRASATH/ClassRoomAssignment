package week3.day1;

public class SafariBrowser extends Browser {
	
	public void readerMode()
	{
		System.out.println("Reader mode opened..");
	}
	public void fullScreenMode()
	{
		System.out.println("FullScreen Mode..");
	}

	public static void main(String[] args) {
		
		SafariBrowser org=new SafariBrowser();
		org.openURL();
		org.readerMode();
		org.fullScreenMode();
		org.closeBrowser();
		org.navigateBack();

	}

}
