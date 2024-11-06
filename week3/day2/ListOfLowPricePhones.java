package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfLowPricePhones {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobilephones");
		driver.findElement(By.id("nav-search-submit-button")).click();
        List<WebElement> elements = driver.findElements(By.className("a-price-whole"));
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<elements.size();i++) {
        	
        	String price=elements.get(i).getText().replaceAll(",","");
			int amt=Integer.parseInt(price);
        	li.add(amt);
		}
        Collections.sort(li);
        
        System.out.println(li);
        
        
	}

}
