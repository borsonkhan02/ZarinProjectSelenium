package calendar.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleThree {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.phptravels.net/");
		
		String date = "31/12/2019";
		
		WebElement checkin = driver.findElement(By.id("checkin"));
				
		datePicker(driver, checkin, date);
		
		Thread.sleep(2000);
		
		driver.quit();

}
	public static void datePicker(WebDriver driver, WebElement ele, String dateValue) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value','" + dateValue + "');", ele);

	}
}