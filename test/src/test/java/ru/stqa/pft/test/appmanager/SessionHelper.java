package ru.stqa.pft.test.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper {
    public WebDriver driver;

    public SessionHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void logInStore(String email, String password) {
        driver.get("http://localhost/litecart/en/");
        driver.findElement(By.cssSelector("input[name=email]")).sendKeys(email);
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys(password);
        driver.findElement(By.cssSelector("button[name=login]")).click();
    }
}
