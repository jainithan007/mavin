package Task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guvitask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.guvi.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement signupbutton = driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary text-white px-4']"));
		
		signupbutton.click();
		
		
	    driver.findElement(By.id("name")).sendKeys("jainithan");//by id	
				
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("jainithan446@email.com");//xpath
		
		driver.findElement(By.id("password")).sendKeys("jai@23");//by.id

		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9087618085");//xpath
		
		driver.findElement(By.id("signup-btn")).click();//login button
		
		String pagetitleaftersignup = driver.getTitle();
		if(pagetitleaftersignup.equals(pagetitleaftersignup)) {
		     
		System.out.println("Registrationsuccessful" );
		
	}else {
		
		System.out.println("Registrationfail" );
		
	}
		driver.close();
		
	
        	
	}
		
		
		

}
