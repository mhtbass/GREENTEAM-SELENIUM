package com.team.green.test;

import com.team.green.base.BaseTest;
import com.team.green.page.PuanPage;
import com.team.green.page.WeeklyPage;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class WeeklyPageTest extends BaseTest {

    WeeklyPage weeklyPage;
    String pagepriceString;

    @BeforeStep
    public void before() {
        weeklyPage = new WeeklyPage(getWebDriver());
    }

    @Step({"Haftanın çok satanlarına tıklanır"})
    public void clickWeek() {
        weeklyPage.clickWeekly();
    }


    @Step("Telefonlardan 3. tıklanır")
    public void clickphone3() {
        weeklyPage.clickphone();
    }

    @Step("Sepete eklenir")
    public void clickrecophone() {
        pagepriceString = weeklyPage.getTextPage();
        weeklyPage.clickrecophone();

    }

    @Step("Sepete gidilir")
    public void implementation1() {
        weeklyPage.goBasket();
    }

    @Step("Sayfadaki fiyatıyla sepet fiyatı karşılaştırılır")
    public void basketCheck() {
        String onBasket = weeklyPage.getTextBasket();
        Assert.assertEquals(onBasket, pagepriceString);
    }

    @Step("Sepetten sil")
    public void implementation2() {

        weeklyPage.clickDelete();
    }
}
