package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		boolean isSelected = driver.findElement(By.xpath("//label[text()='Select the languages that you know?']"))
				.isSelected();

		if (isSelected) {
			System.out.println("the box is ticked");
		} else
			System.out.println("the box is not ticked");

		boolean isSelected2 = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']"))
				.isSelected();
		if (!isSelected2) {
			System.out.println("the box is ticked");
		} else
			System.out.println("the box is not ticked");

	}

}
