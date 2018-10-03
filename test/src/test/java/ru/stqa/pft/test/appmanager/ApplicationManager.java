package ru.stqa.pft.test.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    public WebDriver driver;
    private SessionHelper sessionHelper;
    public WebDriverWait wait;

    public void init() {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("start-maximized");
        driver = new ChromeDriver(opt);
        sessionHelper = new SessionHelper(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        sessionHelper.logInStore("test12@test.com", "1234567890");
    }

    public void stop() {
        driver.quit();
    }

    public void clickEditAccount(){
        driver.findElement(By.cssSelector("div#box-account ul li:nth-child(3) a[href='http://localhost/litecart/en/edit_account']")).click();
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}
