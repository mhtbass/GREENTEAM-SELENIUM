package com.team.green.test;

import com.team.green.base.BaseTest;
import com.team.green.page.KategoriKediPage;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;

public class KategoriKediPageTest extends BaseTest {

    KategoriKediPage kategoriKediPage;

    @BeforeStep
    public void before() {
        kategoriKediPage = new KategoriKediPage(getWebDriver());
    }


    @Step("Süpermarket kategorisine tıklanır")
    public void clickSupermarket() {
        kategoriKediPage.hoversuper();
    }

    @Step("Kedi secenegi seçilir")
    public void clickCat() {
        kategoriKediPage.clickCat();
    }

    @Step("İlk ürüne tıklanır")
    public void clickFirst() {
        kategoriKediPage.clickFirst();
    }

    @Step("Hemen AL tıklanır")
    public void buyNow() {
        kategoriKediPage.buyNowCatpage();
    }

    @Step("Vazgeç tıklanır")
    public void giveup() {
        kategoriKediPage.giveup();
    }
}
