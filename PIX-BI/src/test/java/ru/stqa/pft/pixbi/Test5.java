package ru.stqa.pft.pixbi;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test5 {
  private WebDriver dr;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    dr = new FirefoxDriver();
    dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test5() throws Exception {
    dr.get("https://dev.pixbi.ru/login");
    dr.findElement(By.id("login_username")).clear();
    dr.findElement(By.id("login_username")).sendKeys("rinatganiev");
    dr.findElement(By.xpath("//div[@id='root']/section/section/main/div/div")).click();
    dr.findElement(By.id("login_password")).click();
    dr.findElement(By.id("login_password")).clear();
    dr.findElement(By.id("login_password")).sendKeys("Tataria99@");
    dr.findElement(By.xpath("//form[@id='login']/div[3]/div/div/div/div/div/button/span")).click();
    dr.findElement(By.xpath("//div[@id='root']/section/section/main/section/div[4]/div[2]/div/a/div/img")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    dr.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      dr.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      dr.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

}
