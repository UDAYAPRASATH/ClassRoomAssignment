package week2.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args)  {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/S")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Udayaprasath");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karnan");
		Select select=new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		select.selectByValue("LEAD_EMPLOYEE");
		Select Select1=new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
	    Select1.selectByValue("CATRQ_AUTOMOBILE");
	    Select s=new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
	    s.selectByValue("OWN_CCORP");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		
		if(title.contains("View Lead"))
		{
			System.out.println("Verified");
		}
		else
		{
			System.out.println("Not Verified");
		}
		
		
		
	}

}
