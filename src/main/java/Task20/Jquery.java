package Task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jquery {

	public static void main(String[] args) {

    WebDriver driver  = new ChromeDriver();
  
     driver.get("https://jqueryui.com/datepicker/");
     
     driver.manage().window().maximize();
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     
     driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
     
     //click the nxt month
     
     driver.findElement(By.xpath("//input[@id='datepicker']")).click();
     
     driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
     
     //select the date
     driver.findElement(By.xpath("//a[text()='22']")).click();
     
     
       String selectdate = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");     
        System.out.println( "selected date:" + selectdate);
        
        driver.quit();
		
	}

}
