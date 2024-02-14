package Task25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/tags/table/");
		
		driver.manage().window().maximize();
		
		String text = driver.findElement(By.xpath("(((//table)[1]//tr)[2]//td)[1]")).getText();
		System.out.println(text);
	}

}
