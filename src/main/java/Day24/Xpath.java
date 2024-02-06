package Day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		//textpath
		//driver.findElement(By.xpath( " //a[text()='Fresh']")).sendKeys("mobile");
		
		//driver.findElement(By.xpath("( //input[@class='nav-input nav-progressive-attribute'])[1]")).sendKeys("Mobile");
      
		//driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("Mobile");
    
		// parent
		driver.findElement(By.xpath("//div[@class='nav-search-field ']/input")).sendKeys("mobiles");
		
	}

}
