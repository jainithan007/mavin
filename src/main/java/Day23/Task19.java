package Day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task19 {

	public static void main(String[] args) {
		
		
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.guvi.in/register");
    
    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


		
		driver.findElement(By.id("name")).sendKeys("jainithan");//by id
		
		//driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("jain");// xpath
	    //driver.findElement(By.cssSelector("input#name")).sendKeys("jainithan");
				
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("jainithan446@email.com");//xpath
		
		
		driver.findElement(By.id("password")).sendKeys("jai@23");//by.id
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jai@123");//xpath
		
		
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9087618085");//xpath
		//driver.findElement(By.id("mobileNumber")).sendKeys("9086618086");by.id
		
		driver.findElement(By.id("signup-btn")).click();//login button
		
		System.out.println("login successfully");
				
		
		
	}

}
