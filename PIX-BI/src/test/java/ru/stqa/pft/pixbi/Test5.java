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
    private WebDriver wd;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("https://dev.pixbi.ru/login");
        login("rinatganiev", "Tataria99@");
    }

    private void login(String username, String password) {
        wd.findElement(By.id("login_username")).clear();
        wd.findElement(By.id("login_username")).sendKeys(username);
        wd.findElement(By.xpath("//div[@id='root']/section/section/main/div/div")).click();
        wd.findElement(By.id("login_password")).click();
        wd.findElement(By.id("login_password")).clear();
        wd.findElement(By.id("login_password")).sendKeys(password);
        wd.findElement(By.xpath("//form[@id='login']/div[3]/div/div/div/div/div/button/span")).click();
    }

    @Test
    public void tests5() throws Exception {
      gotoBasePage();
    }

  private void gotoBasePage() {
    wd.findElement(By.xpath("//div[@id='root']/section/section/main/section/div[4]/div[2]/div/a/div/img")).click();
  }

  @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        wd.quit();
    }

    private boolean isElementPresent(By by) {
        try {
            wd.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

}
