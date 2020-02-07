package calendar.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleOne {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.expedia.com/");

		String dateValue = "12/28/2019";

		WebElement element = driver.findElement(By.xpath("//input[@id='package-departing-hp-package']"));
		
		datePicker(driver, element, dateValue);
		
		Thread.sleep(2000);

		driver.quit();
	}
	
	public static void datePicker(WebDriver driver , WebElement ele, String dateValue) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("arguments[0].setAttribute('value','"+dateValue+"');", ele);
		
	}

}
