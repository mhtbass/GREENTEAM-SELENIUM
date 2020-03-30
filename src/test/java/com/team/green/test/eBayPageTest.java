package com.team.green.test;

import com.team.green.base.BaseTest;
import com.team.green.page.LiveSupportPage;
import com.team.green.page.eBayPage;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;

public class eBayPageTest extends BaseTest {

    eBayPage ebayPage;

    @BeforeStep()
    public void before() {
        ebayPage = new eBayPage(getWebDriver());
    }

    @Step("ülkeler simgesi üzerine gelinir")
    public void eBayPlaceHolder(){
        ebayPage.eBayPlaceHolder();
    }
    @Step("Amerikaya tıklanır")
    public void eBayAmerica(){
        ebayPage.eBayAmerica();
    }
    @Step("Fransa tıklanır")
    public void eBayFransa(){
        ebayPage.eBayFransa();
    }
    @Step("Belçika tıklanır")
    public void eBayBelcika(){
        ebayPage.eBayBelcika();
    }


}
