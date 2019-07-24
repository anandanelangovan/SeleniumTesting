package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SeleniumScript {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
	  driver.findElement(By.xpath("//input[@name='login']")).click();


			  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2d.02.11\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com");
  }

  @AfterMethod
  public void afterMethod() {
	  Assert.assertTrue(driver.getTitle().contains("Find a Flight"));
	  driver.quit();
  }

}
