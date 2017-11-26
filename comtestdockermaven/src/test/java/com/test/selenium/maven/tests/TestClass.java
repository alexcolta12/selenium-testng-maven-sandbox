package com.test.selenium.maven.tests;

import com.test.selenium.maven.framework.DriverManager;
import com.test.selenium.maven.model.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

    protected WebDriver driver;

    @Test(description = "My Test")
    public void myTest() {
        DriverManager dm = new DriverManager();
        dm.buildDriver(Browser.HEADLESS_CHROME);
        driver = dm.getDriver();
        driver.navigate().to("https://www.google.com");
        System.out.println(System.getProperty("os.name"));
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Google"));
        driver.quit();
    }
}
