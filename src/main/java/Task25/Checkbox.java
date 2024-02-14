package Task25;

import java.time.Duration;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Checkbox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement checkoptions  =  driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		 for (WebElement ele:  checkoptions) {
			 
			
			 
			 
			 
			 
			
			
		}
		
		
		
		
		
		
	}

}
