package radio.checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.dyn-web.com/tutorials/forms/examples/pizza.php");
		
		List<WebElement> radioButton = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(int i=0;i<radioButton.size();i++) {
		
			WebElement element = radioButton.get(i);

			String value = element.getAttribute("value");
			
			if (value.equalsIgnoreCase(" Small")) {
				
				element.click();
				
			}
			
			
			
		
		}
		
		driver.quit();
		
	}

}
