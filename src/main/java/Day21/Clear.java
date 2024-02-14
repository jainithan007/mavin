package Day21;
	import java.awt.RenderingHints.Key;

		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Clear {

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
		     
			 ChromeDriver driver = new ChromeDriver(); //set the driver launch the url
			 
			 driver.get("https://www.google.com/"); //load the Url
			   
			
			 driver.manage().window().maximize();
			 
			 WebElement element =  driver.findElement(By.name("q"));
			 
				element.sendKeys("SELENIUM BROWSER DRIVER");
				Thread.sleep(3000);
				
				element.clear();
				
				String attrivalue =  element.getAttribute("id");
				System.out.println("attrivalue:"+attrivalue );
				
				String colour = element.getCssValue("background-color");
				System.out.println("colour value:"+ colour );
				
				
				WebElement element2 = driver.findElement(By.xpath("//a[@aria-label='Gmail (opens a new tab)']"));
				
				System.out.println(element2.getText());
				
              String tag = element2.getTagName();
				
				System.out.println("tag name:"+ tag);
			 
			
		
	}

}
