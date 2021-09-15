package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Jisha");
		driver.findElement(By.name("lastname")).sendKeys("A");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.id("password_step_input")).sendKeys("jishunithu");

		WebElement day = driver.findElement(By.id("day"));
		Select day1 = new Select(day);
		day1.selectByValue("3");

		WebElement month = driver.findElement(By.id("month"));
		Select month1 = new Select(month);
		month1.selectByVisibleText("May");

		WebElement year = driver.findElement(By.id("year"));
		Select year1 = new Select(year);
		year1.selectByValue("1997");
		
		driver.findElement(By.className("_58mt")).click();

	}

}
