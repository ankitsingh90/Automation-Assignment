package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver dr = new ChromeDriver();
		Thread.sleep(1000);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dr.get("https://dev.deepthought.education/login");
		WebElement UserName = dr.findElement(By.id("username"));
		UserName.sendKeys("Ankit901");
		WebElement password = dr.findElement(By.id("password"));
		password.sendKeys("t#FbbJQpr4t5RSu");
		WebElement login = dr.findElement(By.id("login"));
		login.click();
		Thread.sleep(Duration.ofSeconds(10));
		String AcceptedTitle ="Welcome to DeepThought | DeepThought";
		String actualTitle= dr.getTitle();
		System.out.println(actualTitle);
		if(actualTitle.equals(AcceptedTitle)) {
			System.out.println("Test successful login with valid credentials ");
		}
		else {
			System.out.println("Test Not successful login with valid credentials ");
		}
		dr.quit();
		
	}

}
