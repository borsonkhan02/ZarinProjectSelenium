package multiple.window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TwoPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://phptravels.com/");

		WebElement product = driver.findElement(By.xpath("//button[contains(text(),'Products')]"));

		hoverOver(driver, product);

		WebElement techno = driver.findElement(By.xpath("//button[contains(text(),'Travel Portal')]"));

		hoverOver(driver, techno);

		WebElement object = driver.findElement(By.xpath("//a[contains(text(),'Obtain License')]"));

		object.click();

		// here we get all window
		Set<String> windowId = driver.getWindowHandles();

		Iterator<String> itr = windowId.iterator();

		String mainWindow = itr.next();

		String childWindow = itr.next();

		// go to next / child window
		driver.switchTo().window(childWindow);

		// close child window
		driver.close();

		// come back to main window
		driver.switchTo().window(mainWindow);

		// then click any element from parent window or menuBar to prove that multiple
		// window handle working
		driver.findElement(By.xpath("//a[contains(text(),'Demo')]")).click();

		WebElement text = driver.findElement(By.className("resource-info"));
		
		Thread.sleep(2000);

		System.out.println(text.getText());
	

		driver.quit();

	}

	public static void hoverOver(WebDriver driver, WebElement element) {

		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();

	}

}
