package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTest {
	
	public void testLogin() throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("file:///C:/Docs/CMU/Job%20Prep/QA/CICD/Online_Fruits_And_Veggies_DEVOPS/index.html");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@name='uname']")).sendKeys("Online_User");
	    driver.findElement(By.xpath("//input[@name='psw']")).sendKeys("Online_User");
	    
	    driver.findElement(By.xpath("//button[@class='loginbtn']")).click();
	    Thread.sleep(2000);
	     
	}

}
