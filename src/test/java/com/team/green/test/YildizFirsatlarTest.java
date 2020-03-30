package com.team.green.test;

import com.team.green.base.BaseTest;
import com.team.green.page.YildizFirsatlar;
import com.thoughtworks.gauge.Step;

public class YildizFirsatlarTest extends BaseTest {

    YildizFirsatlar yildizFirsatlar;

    @Step({"Urune tikla"})
    public void addToBasket() {
        yildizFirsatlar.addToBasket();
    }

}
