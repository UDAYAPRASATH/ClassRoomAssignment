package week2.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("testleaf.2003@gmail.com");
		WebElement element = driver.findElement(By.id("pass"));
		element.sendKeys("tuna@321");
		
		
		driver.findElement(By.name("login")).click();
		driver.findElement(By.partialLinkText("Find your account and log in.")).click();
		
		String a=driver.getTitle();
		if(a.contains("Forgotten Password | Can't Log In | Facebook"))
				{
			System.out.println("the page is verified");
				}
		else
		{
			System.out.println("the page loaded is different.");
		}
		
		
		

	}

}
