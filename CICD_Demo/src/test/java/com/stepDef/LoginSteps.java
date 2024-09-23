package com.stepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver;
	
	@Given("user is on loginpage")
	public void user_is_on_loginpage() throws InterruptedException {
		System.out.println("Step 1: User is on login page");
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("ec2-18-191-207-33.us-east-2.compute.amazonaws.com";
	    Thread.sleep(2000);
	    
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String uname, String pswd) {
		System.out.println("Step 2: User enters username and password");
	    driver.findElement(By.xpath("//input[@name='uname']")).sendKeys(uname);
	    driver.findElement(By.xpath("//input[@name='psw']")).sendKeys(pswd);
	}

	@When("click on login button")
	public void click_on_login_button() throws InterruptedException {
		System.out.println("Step 3: User clicks login button");
	    driver.findElement(By.xpath("//button[@class='loginbtn']")).click();
	    Thread.sleep(2000);
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
	    System.out.println("Step 4: User lands on home page");
	    //Assert.assertTrue(driver.findElement(By.xpath("//h6[normalize-space()='Dashboard']")).isDisplayed());
	}
	
	/*@When("user enters credentials using DataTable")
	public void user_enters_credentials_using_data_table(DataTable dataTable) {
		System.out.println("Step 2: User enters username and password");
		List<List<String>> data = dataTable.cells();
	    driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
	    driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	}*/
	

}
