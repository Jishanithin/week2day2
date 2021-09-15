package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
	
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();

		driver.findElement(By.linkText("Create Contact")).click();

		driver.findElement(By.id("firstNameField")).sendKeys("Jisha");
		
		driver.findElement(By.id("lastNameField")).sendKeys("A");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("jishu");
		
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("a");
		
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		
		driver.findElement(By.id("createContactForm_description")).sendKeys("MBA graduate with 2 years of experience");
		
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("jishachaji@gmail.com");
		
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select state1=new Select(state);
		state1.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("TestLeaf is the best");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
	}

}
