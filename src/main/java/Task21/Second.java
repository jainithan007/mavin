package Task21;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		String newWindowText = driver.findElement(By.tagName("h3")).getText();
		
		if (newWindowText.equals("New Window")) {
            System.out.println("New Window text is present.");
        } else {
            System.out.println("New Window text is not present.");
        }
		
			
	driver.close();	
	
	driver.quit();
	}

}
