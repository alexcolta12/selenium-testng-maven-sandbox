package com.test.selenium.maven.framework;

import com.test.selenium.maven.model.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


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
        setWebDriverBinaries();
        switch (browser) {
            case CHROME:
                driver = new ChromeDriver();
                break;
            case HEADLESS_CHROME:
                ChromeOptions options = new ChromeOptions();
                options.addArguments("headless");
                options.addArguments("window-size=1900x1080");
                driver = new ChromeDriver(options);
                break;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
