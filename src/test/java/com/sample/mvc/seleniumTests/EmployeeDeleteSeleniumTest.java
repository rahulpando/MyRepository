/*package com.sample.mvc.seleniumTests;





import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmployeeDeleteSeleniumTest {
  private WebDriver driver;
  private String baseUrl;
  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:8090/EMS_HibernateTP/list";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testEdit() throws Exception {
    driver.get(baseUrl + "");
   
    driver.findElement(By.xpath("(//a[contains(text(),'delete')])[4]")).click();

   
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
   
  }

 
}

*/