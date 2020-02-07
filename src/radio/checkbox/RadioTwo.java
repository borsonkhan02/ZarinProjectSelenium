package radio.checkbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioTwo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.dyn-web.com/tutorials/forms/examples/pizza.php");

		WebElement radioList = driver.findElement(By.xpath("//input[@type='radio'][1]"));
		WebElement radioListTWO = driver.findElement(By.xpath("//input[@type='radio'][2]"));
		WebElement radioListThree = driver.findElement(By.xpath("//input[@type='radio'][3]"));

		driver.quit();

	}
}