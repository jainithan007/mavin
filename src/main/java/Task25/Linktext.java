package Task25;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Linktext {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.google.com/");
		 
		 driver.manage().window().maximize();
		 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println("no of links present in the page:"  + size);
		
		for (WebElement link : links) {
		
		String text = link.getText();
		String href = link.getAttribute("href");
		System.out.println(href+ " -> " +text);
		
		
		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\jai\\eclipse-workspace\\Excel\\snap\\Screenshot1.png");
	    FileUtils.copyFile(source, dest);	
	
		
		
	}
	}
}


