package explicite.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handleExpliciteWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://github.com/");

		WebElement userName = driver.findElement(By.id("user[login]"));
		userName.sendKeys("borson");
		WebElement userEmail = driver.findElement(By.id("user[email]"));
		userEmail.sendKeys("kh@gmail.com");
		WebElement password = driver.findElement(By.id("user[password]"));
		password.sendKeys("0123");

		setexpliciteWait(driver, userName, 5);

		setexpliciteWait(driver, userEmail, 10);

		driver.quit();
	}

	// this is supporting method for explicit wait for all kind of framework
	public static void setexpliciteWait(WebDriver driver, WebElement ele, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, timeOut);

		wait.until(ExpectedConditions.elementToBeClickable(ele));

		ele.click();

	}

	// this is supporting method for explicit wait for all kind of framework
	public static void expliciteWaitVisible(WebDriver driver, WebElement ele, int timeOut, String vlaue) {

		WebDriverWait wait = new WebDriverWait(driver, timeOut);

		wait.until(ExpectedConditions.visibilityOf(ele));

		ele.click();

	}

}