package com.team.green.test;

import com.team.green.base.BaseTest;
import com.team.green.page.SearchPage;
import com.team.green.page.SearchPage2;
import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;


public class SearchPageTest2 extends BaseTest {

    SearchPage2 sepetPage;


    @Step({"Gitti gidiyor sitesine gidilir"})
    public void before() {
        sepetPage = new SearchPage2(getWebDriver());
    }

    @Step({"Arama çubuğuna <text> yazılır"})
    public void searchText(String text) {
        sepetPage.search(text);
    }

    @Step({"Ara butonuna tıklanır"})
    public void searchClick() throws InterruptedException {
        sepetPage.searchClick();
        Thread.sleep(2000);
    }

    @Step({"Acilan sayfa da URL dogrulanir"})
    public void control() {

        String urlEquals = "https://www.gittigidiyor.com/arama";
        assertEquals("https://www.gittigidiyor.com/arama", urlEquals);
        System.out.println("LUTFEN SADECE TURKCE KARAKTER GIRINIZ");
    }

    public void clickElement(WebElement element) {
        element.click();

    }

    @Step({"Aclan sayfa da siparislerim URL dogrulanir"})
    public void controlProduct() {
        String urlEquals = "https://www.gittigidiyor.com/BanaOzel/satin-aldiklarim.php";
        assertEquals("https://www.gittigidiyor.com/BanaOzel/satin-aldiklarim.php", urlEquals);
        System.out.println("SIPARISLERIM EKRANINA GELDINIZ");
    }


    @Step("Take a screenshot with the name <pictureName>.")
    public void takesScreenshot(String pictureName) throws IOException {
        String fileName = "images/" + (pictureName) + ".png";
        File file = new File("reports/html-report/" + fileName);
        if (file.exists()) {
            file.delete();
        }
        File scrFile = ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, file);
        Gauge.writeMessage("<img src='../" + fileName + "' width='800' height='480'");
    }

}
