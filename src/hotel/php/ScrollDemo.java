package hotel.php;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.phptravels.net/");

		String date = "31/12/2019";

		String dateCheckout = "1/12/2019";

		WebElement location = driver.findElement(By.xpath("//input[@type='text']"));

		location.sendKeys("new");

		Thread.sleep(2000);

		WebElement india = driver.findElement(By.xpath(".//*[@id='select2-drop']/ul/li/ul/li[2]/div"));

		india.click();

		Thread.sleep(3000);

		WebElement checkin = driver.findElement(By.id("checkin"));

		datePicker(driver, checkin, date);

		Thread.sleep(3000);

		WebElement checkout = driver.findElement(By.id("checkout"));

		datePicker(driver, checkout, dateCheckout);

		Thread.sleep(3000);

		WebElement adult = driver.findElement(By.xpath("//button[contains(text(),'+')]"));

		adult.click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(3000);

		driver.quit();
	}

	public static void datePicker(WebDriver driver, WebElement ele, String dateValue) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('value','" + dateValue + "');", ele);

	}
}