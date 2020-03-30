package com.team.green.base;

import com.team.green.constants.Constants.*;
import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.team.green.constants.Constants.*;

public class BaseTest {

    static WebDriver webDriver=null;

    @BeforeScenario
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "web_driver/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("disable-notifications");
        chromeOptions.addArguments("disable-popup-blocking");
        setWebDriver(new ChromeDriver(chromeOptions));
        getWebDriver().navigate().to(WEBLINK);


        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        webDriver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        BaseTest.webDriver = webDriver;
    }

    @AfterScenario
    public void tearDown(){
        getWebDriver().quit();
    }

    @Step("Take a screenshot with the name <pictureName>")
    public void takesScreenshot(String pictureName) throws IOException {
        String fileName = "images/"+(pictureName)+".png";
        File file = new File("reports/html-report/"+fileName);
        if(file.exists()) {
            file.delete();
        }
        File scrFile = ((TakesScreenshot)getWebDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, file);
        Gauge.writeMessage("<img src='../"+fileName+"' width='800' height='480'");
    }

}
