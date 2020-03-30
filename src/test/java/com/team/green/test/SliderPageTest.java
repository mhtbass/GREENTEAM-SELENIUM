package com.team.green.test;

import com.team.green.base.BaseTest;

import com.team.green.page.SliderPage;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class SliderPageTest extends BaseTest {
    SliderPage sliderPage;

    @BeforeStep()
    public void before() {
        sliderPage = new SliderPage(getWebDriver());
    }

    @Step("popu kapat")
    public void popukapatClick() {
        sliderPage.popukapatClick();

    }

    @Step("slider üzerine gel")
    public void sliderClick() {
        sliderPage.sliderClick();

    }

    @Step("sağa kaydır")

    public void sagClick() {
        sliderPage.sagClick();
    }

    @Step("sola kaydır")
    public void solClick() {

    }


}
