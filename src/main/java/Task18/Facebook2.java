package Task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {

	public static void main(String[] args) {


		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.manage().window().maximize();
		
		 driver.findElement(By.linkText("Create new account")).click();
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Text");
		 
		// driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("User");
		 driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("23nithesh@gmail.com");
		 driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("jai@minnu23");
		 driver.findElement(By.id("day")).sendKeys("11");
		 driver.findElement(By.id("month")).sendKeys("May");
		 driver.findElement(By.id("Year")).sendKeys("1985");
		 driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		 driver.findElement(By.linkText("Sign Up")).clear();

	}
	
	

}
