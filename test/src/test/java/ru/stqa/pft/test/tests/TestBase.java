package ru.stqa.pft.test.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import ru.stqa.pft.test.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeTest
    public void setUp(){
        app.init();
    }

    @AfterTest
    public void close(){
        app.stop();
    }

}
