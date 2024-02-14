package Task22;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task22 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://phptravels.com/demo/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Nithesh");
		
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("minnu");
		
		driver.findElement(By.xpath("//input[@name='business_name']")).sendKeys("SAIN CONSTRACTION");
		
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("23nithesh@gmail.com");
		
		//driver.findElement(By.xpath("//span[@id='numb1']")).click();
		
		//driver.findElement(By.xpath("(//*[contains(text(),'+')])[3]"));
		
		//driver.findElement(By.xpath("//span[@id='numb2']")).click();
		
		WebElement ele   = driver.findElement(By.id("numb1"));
		String a =  ele.getText();
		WebElement ele2 = driver.findElement(By.id("numb2"));
		String b = ele2.getText();
	    Integer.parseInt(a);
	    Integer.parseInt(b); 
	    String c = Integer.parseInt(a) + Integer.parseInt(b) + "";
	    
	   driver.findElement(By.xpath("//input[@id='number']")).sendKeys(c);
	   
	    WebElement submitbutton = driver.findElement(By.xpath("//button[@id='demo']"));
	    
	    Thread.sleep(3000);
	    submitbutton.click();
	    
	    Thread.sleep(3000);
	    
	    
	    TakesScreenshot screenshot = ((TakesScreenshot) driver);
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\jai\\eclipse-workspace\\Excel\\snap\\Screenshot1.png");
	    FileUtils.copyFile(source, dest);	
	
	 
	}

}
