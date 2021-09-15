package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonHtml {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		WebElement text = driver.findElement(By.id("color"));
		System.out.println(text.getText());
		System.out.println(text.getSize());
		System.out.println(text.getTagName());
	}

}
