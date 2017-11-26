package com.test.selenium.maven.framework;

import com.test.selenium.maven.model.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverManager {

    private WebDriver driver;

    public DriverManager() {
        driver = null;
    }

    private void setWebDriverBinaries() {
        switch (System.getProperty("os.name")) {
            case "Windows 10":
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//windows//chromedriver_2_33.exe");
                break;
        }
    }

    public void buildDriver(Browser browser) {
        switch (browser) {
            case CHROME:
                setWebDriverBinaries();
                driver = new ChromeDriver();
                break;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
