package ru.stqa.pft.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeTest
    public void setUp(){
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("start-maximized");
        driver = new ChromeDriver(opt);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        logInStore();
    }

    @AfterTest
    public void close(){
        driver.quit();
    }

    private void logInStore() {
        driver.get("http://localhost/litecart/en/");
        driver.findElement(By.cssSelector("input[name=email]")).sendKeys("test12@test.com");
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys("1234567890");
        driver.findElement(By.cssSelector("button[name=login]")).click();
    }

    public void clickEditAccount(){
        driver.findElement(By.cssSelector("div#box-account ul li:nth-child(3) a[href='http://localhost/litecart/en/edit_account']")).click();
    }
}
