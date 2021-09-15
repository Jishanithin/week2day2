package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		String title = driver.getTitle();
		System.out.println(title);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.name("UserFirstName")).sendKeys("Jishu");
		driver.findElement(By.name("UserLastName")).sendKeys("A");
		driver.findElement(By.name("UserEmail")).sendKeys("jishuchajima@gmail.com");

		WebElement jobtitle = driver.findElement(By.name("UserTitle"));
		Select job1 = new Select(jobtitle);
		job1.selectByValue("IT_Manager_AP");

		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");

		WebElement emp = driver.findElement(By.name("CompanyEmployees"));
		Select emp1 = new Select(emp);
		emp1.selectByVisibleText("1501+ employees");

		driver.findElement(By.name("UserPhone")).sendKeys("7010758897");

		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select country1 = new Select(country);
		country1.selectByValue("IN");

		driver.findElement(By.className("checkbox-ui")).click();

	}

}
