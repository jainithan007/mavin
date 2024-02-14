package Task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("adhi");
		
		 driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("frybox");
		 
		 driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("23nithesh@gmail.com");
		 driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("23nithesh@gmail.com");
		 driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("jai@minnu23");
		 driver.findElement(By.id("day")).sendKeys("11");
		 driver.findElement(By.id("month")).sendKeys("May");
		 
	     WebElement year = driver.findElement(By.name("birthday_year"));
	     
	     Select sel = new Select(year);
	     sel.selectByVisibleText("1985");
	     
		 
		 WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		 
		 gender.click();
		
		 WebElement signup = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		 signup.click();

	}

}
