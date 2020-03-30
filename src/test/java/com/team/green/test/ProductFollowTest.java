package com.team.green.test;


import com.team.green.base.BaseTest;
import com.team.green.page.ProductFollow;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;

public class ProductFollowTest extends BaseTest {

    ProductFollow productFollowTest;

    @BeforeStep
    public void before() {
        productFollowTest =new ProductFollow(getWebDriver());
    }

    @Step({"Sipariş takibi butonuna tiklanirr"})
    public void clickProductFollow() {
        productFollowTest.clickProductFollow();
    }


}
