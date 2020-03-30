package com.team.green.test;




import com.team.green.base.BaseTest;
import com.team.green.page.LogOutPage;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;


public class LogOutPageTest extends BaseTest {

    LogOutPage logOutPage;

    @BeforeStep
    public void before() {
        logOutPage =new LogOutPage(getWebDriver());

    }

    @Step({"Çıkış yapılır"})
    public void clickLogout (){
        logOutPage.logOutClick();
    }
    @Step({"Hesap üstüne gelinir"})
    public void overAcc (){
        logOutPage.accountOVer();
    }

    @Step("Resim çekme <pictureName>.")
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
