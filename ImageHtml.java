package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageHtml {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		WebElement img = driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/img"));
		System.out.println("size is" +img.getSize());
		System.out.println("tagname is" + img.getTagName());
		System.out.println(img.isDisplayed());
	}

}
