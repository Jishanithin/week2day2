package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditHtml {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		boolean isEnable = driver.findElement(By.xpath("//label[text()='Get default text entered']")).isEnabled();

		if (isEnable) {
			System.out.println("button is enabled");
		} else
			System.out.println("button is not enabled");

		boolean isEnable1 = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();

		if (isEnable1) {
			System.out.println("button is enabled");
		} else
			System.out.println("button is not enabled");

	}

}
