package Task25;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Html {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/radio-button");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		List<WebElement> radiooptions = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for (WebElement ele : radiooptions) {
			
			String atribute = ele.getAttribute("id");
			
			if(atribute.equals("impressiveRadio")) {
				
				Actions  mouse = new Actions(driver);
				mouse.click(ele).perform();
				
				if(ele.isSelected()) {
			
				System.out.println("Impressive button is selected");
				
				}else {
					
					System.out.println("impressive not selected"); 
				}
					
			}
		}
		
	}
}
