package multiple.window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstPractice {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://phptravels.com");
		
		WebElement product = driver.findElement(By.xpath("//button[contains(text(),'Products')]"));

		hoverOver(driver, product);

		WebElement techno = driver.findElement(By.xpath("//button[contains(text(),'Travel Portal')]"));

		hoverOver(driver, techno);

		WebElement object = driver.findElement(By.xpath("//a[contains(text(),'Obtain License')]"));

		object.click();
		
		switchToWindow(driver, 0);
		
		System.out.println("go to child window" + driver.getTitle());
		
		switchToWindow(driver, 1);
		
		driver.findElement(By.className("navbar-brand")).click();
		

		driver.quit();
	}

	public static void hoverOver(WebDriver driver, WebElement element) {

		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();

	}
	
	public static void switchToWindow(WebDriver driver, int index) {
		
		String window = null;
		
		Set<String> parentWindow = driver.getWindowHandles();
		
		Iterator<String> childWindow = parentWindow.iterator();
		
		for(int i=0;i<index;i++) {
			
			window = childWindow.next();
			
		}
	}

}
