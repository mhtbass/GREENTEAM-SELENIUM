package com.team.green.test;


import com.team.green.base.BaseTest;
import com.team.green.page.UrunIade;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;

public class UrunIadeTest extends BaseTest {

    UrunIade urunIadeTest;

    @BeforeStep
    public void before() {
        urunIadeTest =new UrunIade(getWebDriver());
    }

    @Step({"Urun iade butonuna tiklanir"})
    public void clickUrunIade() {
        urunIadeTest.clickUrunIade();
    }

}
