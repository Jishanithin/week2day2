package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://www.leafground.com/pages/Dropdown.html");
	WebElement dropdown = driver.findElement(By.id("dropdown1"));
	Select drop1=new Select(dropdown);
	drop1.selectByIndex(3);
	
	WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
	Select drop2=new Select(dropdown2);
	drop2.selectByVisibleText("Selenium");
	
	WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
	Select drop3=new Select(dropdown3);
	
	drop3.selectByValue("2");
	
	

	}

}
