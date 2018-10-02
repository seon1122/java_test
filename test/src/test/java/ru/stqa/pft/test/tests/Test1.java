package ru.stqa.pft.test.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends TestBase {

    @Test
    public void test1() throws InterruptedException {
        Assert.assertTrue(app.driver.findElement(By.cssSelector("div#notices")).getText().contains("You are now logged in as test test."));
        app.clickEditAccount();
    }
}
