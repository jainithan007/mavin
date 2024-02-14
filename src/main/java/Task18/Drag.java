 package Task18;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
	
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement dest = driver.findElement(By.id("droppable"));
		
		Actions mouse = new Actions(driver);
		mouse.dragAndDrop(source, dest).perform();
		
		String targetColor = source.getCssValue("background-color");
        System.out.println("Target element color: " + targetColor);
        
        String targetText = dest.getText();
        System.out.println("Target element text: " + targetText);

		driver.quit(); 
		
		
		
		
		
		
	}

}
